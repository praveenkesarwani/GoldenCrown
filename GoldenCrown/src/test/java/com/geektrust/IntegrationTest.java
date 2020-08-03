package com.geektrust;

import com.geektrust.util.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
  Solver solver;
  private String FIXTURE;

  @BeforeEach
  public void init() {
    Path path = Paths.get("src", "test", "resources");
    this.FIXTURE = path.toFile().getAbsolutePath();
    solver = new Solver();
  }

  @Test
  public void shouldGiveAlliance() throws IOException {
    testAlliance(getInputLinesForFirstInput(), getOutputForFirstInput());
    testAlliance(getInputLinesForThirdInput(), getOutputForThirdInput());
  }

  @Test
  public void shouldGiveNone() throws IOException {
    testAlliance(getInputLinesForSecondInput(), getOutputForSecondInput());
  }

  private void testAlliance(List<String> inputLines, String outputExpected) {
    solver.init(inputLines);
    String output = solver.solveAndGetAlliancesName();
    assertEquals(outputExpected, output);
  }

  private List<String> getInputLinesForFirstInput() throws IOException {
    String filePath = FIXTURE + "/input/input1.txt";
    return Utility.getInputLinesAsList(filePath);
  }

  private List<String> getInputLinesForSecondInput() throws IOException {
    String filePath = FIXTURE + "/input/input2.txt";
    return Utility.getInputLinesAsList(filePath);
  }

  private List<String> getInputLinesForThirdInput() throws IOException {
    String filePath = FIXTURE + "/input/input3.txt";
    return Utility.getInputLinesAsList(filePath);
  }

  private String getOutputForFirstInput() throws IOException {
    String filePath = "output/output1.txt";
    return Utility.fileToString(filePath);
  }

  private String getOutputForSecondInput() throws IOException {
    String filePath = "output/output2.txt";
    return Utility.fileToString(filePath);
  }

  private String getOutputForThirdInput() throws IOException {
    String filePath = "output/output3.txt";
    return Utility.fileToString(filePath);
  }
}
