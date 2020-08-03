package com.geektrust.cipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncryptorTest {

  Encryptor encryptor;

  @BeforeEach
  void init() {
    encryptor = new Encryptor();
  }

  @Test
  public void shouldGetEncryptedMessage() {
    final String message = "ROZO";
    final String encryptedMessage = encryptor.getEncryptedMessage(message, 3);

    assertEquals("OLWL", encryptedMessage);
  }

  @Test
  public void shouldGetSameMessage() {
    final String message = "SAMEMESSAGE";
    final String encryptedMessage1 = encryptor.getEncryptedMessage(message, 0);
    final String encryptedMessage2 = encryptor.getEncryptedMessage(message, 26);
    final String encryptedMessage3 = encryptor.getEncryptedMessage(message, 52);

    assertEquals(message, encryptedMessage1);
    assertEquals(message, encryptedMessage2);
    assertEquals(message, encryptedMessage3);
  }
}