public class MatchingParentheses {

  public MatchingParentheses() {}

  public boolean match(String input) {
    int balanceCounter = 0;
    int index = 0;

    while (index < input.length()) {
      char paren = input.charAt(index);
      if (paren == '(') {
        balanceCounter += 1;
      } else if (paren == ')') {
        balanceCounter -= 1;
      }
      if (balanceCounter < 0) {
        return false;
      }
      index += 1;
    }

    return balanceCounter == 0;
  }

}
