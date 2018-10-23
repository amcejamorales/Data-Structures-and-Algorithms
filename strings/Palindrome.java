public class Palindrome {

  public Palindrome() {}

  public boolean palindrome(String input) {
    int front = 0;
    int back = input.length() - 1;

    if (back == -1) {
      return false;
    }

    while (front < back) {
      char frontChar = input.charAt(front);
      char backChar = input.charAt(back);
      if (frontChar != backChar) {
        return false;
      }

      front += 1;
      back -= 1;
    }
    return true;
  }

}
