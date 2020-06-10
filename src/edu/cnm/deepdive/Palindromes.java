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
  public static boolean testDenormalized(String input) {
    String normalized = input.replaceAll("[\\W_]+", "").toLowerCase();
    return testRecursive(normalized);
  }

  public static boolean testIterative(String input) {
    boolean isPalindrome = true;


    for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
      if (input.charAt(i) != input.charAt(j)) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }
  public static boolean testReverseIterative(String input) {
    StringBuilder builder = new StringBuilder(input);
    return input.equals(builder.reverse().toString());
  }
}