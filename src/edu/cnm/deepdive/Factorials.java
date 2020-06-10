package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /** The first method written computes the factorial function value using multiplication of Big Integers method.
   *  The second method written below computes teh factorial function value using an interative method over a "for" loop.
   * @param n >= 0
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
//  public static long computeRecursive(int n) throws IllegalArgumentException {
    public static BigInteger factorial(int n) throws IllegalArgumentException {
      BigInteger a = new BigInteger("1");

   long result;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      result = 1;
    } else {
      for (int i = n; i >= 2; i++)
        a = a.multiply(BigInteger.valueOf(i));
//      result = n * computeRecursive(n-1);
    }
    return a;

  }

  public static long computeIterative(int n) throws IllegalArgumentException {
    int i;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    long result = 1;
    for (i = 0; n > i; i++)
      //   if (n > 0) {
      result = i * computeIterative(n - 1);
    return result;
  }
  }