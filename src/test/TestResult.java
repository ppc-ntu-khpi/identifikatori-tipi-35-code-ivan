package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        String text = "Some text to encrypt";
        String key = "secretKey";
        String wrongKey = "wrongKey";
        String encrypted = Exercise.encrypt(text, key);

        System.out.println("\nText: " + text + "\nKey: " + key + "\n");
        System.out.println("Encrypted (some symbols might not be visible in console): " + encrypted + "\n");
        System.out.println("Decrypted: " + Exercise.decrypt(encrypted, key) + "\n");
        System.out.println("Decrypted with wrong key: " + Exercise.decrypt(encrypted, wrongKey));

    }
}
