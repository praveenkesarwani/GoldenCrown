package com.geektrust;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VerifierTest {

  @Test
  public void matchCharsShouldReturnFalse() {
    String message = "MOMAMVTMTMHTM";
    String emblem = "DRAGON";

    assertFalse(Verifier.verify(message, emblem));
  }

  @Test
  public void matchCharsShouldReturnTrue() {
    String message = "AYDSSNJFFJAWWHP";
    String emblem = "PANDA";

    assertTrue(Verifier.verify(message, emblem));
  }
}