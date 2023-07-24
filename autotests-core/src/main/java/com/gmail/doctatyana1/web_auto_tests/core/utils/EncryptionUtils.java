package com.gmail.doctatyana1.web_auto_tests.core.utils;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Helper methods for decrypt/encrypt.
 */
public final class EncryptionUtils {

  private static final String ENCRYPT_ALGO = "AES/GCM/NoPadding";

  private static final int TAG_LENGTH_BIT = 128;
  private static final int IV_LENGTH_BYTE = 12;
  private static final int SALT_LENGTH_BYTE = 16;
  private static final Charset UTF_8 = StandardCharsets.UTF_8;

  // return a base64 encoded AES encrypted text
  public static String encrypt(String text, String password)
      throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException,
      IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException,
      InvalidKeyException {

    // 16 bytes salt
    byte[] salt = getRandomNonce(SALT_LENGTH_BYTE);

    // GCM recommended 12 bytes iv?
    byte[] iv = getRandomNonce(IV_LENGTH_BYTE);

    // secret key from password
    SecretKey aesKeyFromPassword = getAESKeyFromPassword(password.toCharArray(), salt);

    Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);

    // ASE-GCM needs GCMParameterSpec
    cipher.init(Cipher.ENCRYPT_MODE, aesKeyFromPassword, new GCMParameterSpec(TAG_LENGTH_BIT, iv));

    byte[] cipherText = cipher.doFinal(text.getBytes(UTF_8));

    // prefix IV and Salt to cipher text
    byte[] cipherTextWithIvSalt = ByteBuffer.allocate(iv.length + salt.length + cipherText.length)
        .put(iv)
        .put(salt)
        .put(cipherText)
        .array();

    // string representation, base64, send this string to other for decryption.
    return Base64.getEncoder().encodeToString(cipherTextWithIvSalt);

  }

  // we need the same password, salt and iv to decrypt it
  public static String decrypt(String encryptedText, String password)
      throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException,
      IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException,
      InvalidKeyException {

    byte[] decode = Base64.getDecoder().decode(encryptedText.getBytes(UTF_8));

    // get back the iv and salt from the cipher text
    ByteBuffer bb = ByteBuffer.wrap(decode);

    byte[] iv = new byte[IV_LENGTH_BYTE];
    bb.get(iv);

    byte[] salt = new byte[SALT_LENGTH_BYTE];
    bb.get(salt);

    byte[] cipherText = new byte[bb.remaining()];
    bb.get(cipherText);

    // get back the aes key from the same password and salt
    SecretKey aesKeyFromPassword = getAESKeyFromPassword(password.toCharArray(), salt);

    Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);

    cipher.init(Cipher.DECRYPT_MODE, aesKeyFromPassword, new GCMParameterSpec(TAG_LENGTH_BIT, iv));

    byte[] plainText = cipher.doFinal(cipherText);

    return new String(plainText, UTF_8);

  }

  private static SecretKey getAESKeyFromPassword(char[] password, byte[] salt)
      throws NoSuchAlgorithmException, InvalidKeySpecException {
    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    KeySpec spec = new PBEKeySpec(password, salt, 65536, 128);
    return new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");

  }

  private static byte[] getRandomNonce(int numBytes) {
    byte[] nonce = new byte[numBytes];
    new SecureRandom().nextBytes(nonce);
    return nonce;
  }

  private EncryptionUtils() {
  }
}
