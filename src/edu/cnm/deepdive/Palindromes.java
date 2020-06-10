package edu.cnm.deepdive;

public class Palindromes {

  /**
   * Runs a method on an input string to determine whether or not an ordered group of characters is a palindrome, which can be read the same forwards and backwards.
   * @param input a string of length >= 0
   * @return true or false based on whether input string is in fact a palindrome.
   */

  public static boolean testRecursive(String input) {
    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && testRecursive(input.substring(1, input.length() - 1))
    );
  }

}