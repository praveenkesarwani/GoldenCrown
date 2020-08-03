package com.geektrust.cipher;

/**
 * This class provides a function which can be used to Encrypt message.
 */
public class Encryptor {
    // Function returns encrypted text as String
    public static String getEncryptedMessage(String message ,int key){
        key %= 26;
        StringBuilder encryptedMessage = new StringBuilder();
        for(char ch : message.toCharArray()){
            int asciiValue = (int) (ch) - key;
            if (asciiValue < 65) {
                encryptedMessage.append ((char) (asciiValue + 26));
            } else {
                encryptedMessage.append((char) (asciiValue));
            }
        }
        return encryptedMessage.toString();
    }
}
