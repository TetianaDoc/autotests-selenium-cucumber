package com.gmail.doctatyana1.web_auto_tests.core;

/**
 * Operation system types.
 */
public enum OsType {
    LINUX,
    MAC,
    WINDOWS;

    public static OsType from(String os) {
        if (os.startsWith("Mac OS")) {
            return MAC;
        } else if (os.startsWith("Linux")) {
            return LINUX;
        } else if (os.startsWith("Windows")) {
            return WINDOWS;
        }
        throw new IllegalArgumentException("Not found an operation system type for " + os);
    }
}
