package com.gmail.doctatyana1.web_auto_tests.core.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link EncryptionUtils}.
 */
@Slf4j
class EncryptionUtilsTest {

  @Test
  void shouldEncryptAndDecrypt() throws Exception {
    String password = UUID.randomUUID().toString();
    log.info("Got password {}", password);
    String toBeEncrypted = "Hello World";
    log.info("Encrypting {}...", toBeEncrypted);
    String result = EncryptionUtils.encrypt(toBeEncrypted, password);
    log.info("Got encrypted text {}", result);
    log.info("Decrypting {}...", result);
    Assertions.assertThat(EncryptionUtils.decrypt(result, password)).isEqualTo(toBeEncrypted);
  }
}
