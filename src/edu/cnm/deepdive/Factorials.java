package edu.cnm.deepdive;

import java.math.BigInteger;

/**
 * Demonstrates recursive and iterative approaches to computing the factorial function directly.
 */
public class Factorials {

  /**
   * The first method written computes the factorial function value using multiplication of Big
   * Integers method. The second method written below computes teh factorial function value using an
   * interative method over a "for" loop.
   *
   * @param n >= 0, value for which the factorial function is to be computed.
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
//  public static long computeRecursive(int n) throws IllegalArgumentException {
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    BigInteger result = BigInteger.ONE;

    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n > 0) {
      result = BigInteger.valueOf(n).multiply(computeRecursive(n - 1));
    }
    return result;

  }

  public static BigInteger computeIterative(int n) {
    BigInteger result = BigInteger.ONE;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i <= n; i++)
    //   if (n > 0) {
    {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
}