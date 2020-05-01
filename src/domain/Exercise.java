package domain;

import java.nio.charset.StandardCharsets;

public class Exercise {
    /**
     * Method that returns encrypted string
     * @param text text to encrypt
     * @param key key
     * @return String
     */
    public static String encrypt(String text, String key){
        byte[] textInBytes = text.getBytes();
		byte[] keyInBytes = key.getBytes();
		byte[] result = new byte[text.length()];

		for (int i = 0; i < textInBytes.length; i++) {
			result[i] = (byte) (textInBytes[i] ^ keyInBytes[i % keyInBytes.length]);
		}

		return new String(result);
    }

    /**
     * Method that returns decrypted string
     * @param text encrypted text
     * @param key key used for encryption 
     * @return String
     */
    public static String decrypt(String text, String key) {
        byte[] textInBytes = text.getBytes();
		byte[] result = new byte[textInBytes.length];
		byte[] keyInBytes = key.getBytes();

		for (int i = 0; i < textInBytes.length; i++) {
			result[i] = (byte) (textInBytes[i] ^ keyInBytes[i % keyInBytes.length]);
		}

		return new String(result);
	}
}
