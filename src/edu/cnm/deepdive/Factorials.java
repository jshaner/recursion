package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   *
   * @param n
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

}
