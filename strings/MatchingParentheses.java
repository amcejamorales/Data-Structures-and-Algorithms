public class MatchingParentheses {

  public MatchingParentheses() {}

  public Boolean match(String input) {
    int balanceCount = 0;
    int parensCount = 0;
    int index = 0;

    while (index < input.length()) {
      char paren = input.charAt(index);
      if (paren == '(') {
        balanceCount += 1;
        parensCount += 1;
      } else if (paren == ')') {
        balanceCount -= 1;
        parensCount += 1;
      }
      if (balanceCount < 0) {
        return false;
      }
      index += 1;
    }

    if (parensCount == 0) {
        return null;
    }

    return balanceCount == 0;
  }

}
