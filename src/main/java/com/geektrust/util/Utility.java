package com.geektrust.util;

import com.google.common.io.Resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * A utility class which performs basic tasks.
 * e.g. Return a file content as string, Return a file content as list of string.
 */
public class Utility {
  public static String fileToString(String fileName) {
    return util(fileName);
  }

  private static String util(String fileName) {
    final URL resource = Resources.getResource(fileName);
    try {
      return Resources.toString(resource, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new IllegalArgumentException();
    }
  }

  public static List<String> getInputLinesAsList(String path) throws IOException {
    List<String> inputLines = new ArrayList<>();

    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    String line;

    while ((line = bufferedReader.readLine()) != null) {
      inputLines.add(line);
    }

    return inputLines;
  }
}
