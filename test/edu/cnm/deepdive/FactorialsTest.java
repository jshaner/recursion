package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {

  static final int[] params = {
      0, 1, 5, 10, 13
  };

  static final long[] expecteds = {
      1, 1, 120, 3628800, 6227020800L
  };

  static final BigInteger[] bigExpecteds = {
      BigInteger.valueOf(1),
      BigInteger.valueOf(1),
      BigInteger.valueOf(120),
      BigInteger.valueOf(3628800),
      BigInteger.valueOf(6227020800L),

  };

  static final long[][] testCases = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3628800},
      {13, 6227020800L}
  };

  @Test
  void computeRecursive() {
//    for (long[] testCase : testCases) {
    for (int i = 0; i < params.length; i++) {
//      int n = (int) testCase[0];
//      long expected = testCase[1];
      int n = params[i];
      BigInteger expected = BigInteger.valueOf(expecteds[i]);
      BigInteger actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
    //   assertThrows(IllegalArgumentException.class, () -> BigInteger.valueOf(-1));
  }

  @Test
  void computeIterative() {
//    for (long[] testCase : testCases) {
    for (int i = 0; i < params.length; i++) {
//      int n = (int) testCase[0];
//      long expected = testCase[1];
      int n = params[i];
      BigInteger expected = BigInteger.valueOf(expecteds[i]);
      BigInteger actual = Factorials.computeIterative(n);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeIterative(-1));
  }
}