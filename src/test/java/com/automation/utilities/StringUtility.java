package com.automation.utilities;

public class StringUtility {
    public StringUtility() {
    }

    public static void verifyEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)) {
            System.out.println("Pass");
        } else {
            System.out.println("fail" + expected + actual);
        }

    }
}