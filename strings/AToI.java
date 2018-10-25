import java.util.Map;
import java.util.HashMap;

public class AToI {
  private static Map<String, Integer> conversionValues = new HashMap<String, Integer>() {
    {
      put("0", 0);
      put("1", 1);
      put("2", 2);
      put("3", 3);
      put("4", 4);
      put("5", 5);
      put("6", 6);
      put("7", 7);
      put("8", 8);
      put("9", 9);
      put("-", -1);
    }
  };

  public AToI() {}

  public Integer convert(String input) {
    if (input == "") {
      return null;
    }
    int sign = 1;
    int output = 0;
    int index = 0;

    if (input.charAt(0) == '-') {
      sign *= -1;
      index += 1;
    }

    while (index < input.length()) {
      int digit = input.charAt(index) - '0';
      if (digit <= 9) {
        output = output * 10 + digit;
      } else {
        return null;
      }
      index += 1;
    }

    return sign * output;
  }

  public Integer convertAlternative(String input) {
    int charPosition = input.length() - 1;

    if (charPosition == -1) {
      return null;
    }

    int sign = 1;
    int multiplier = 1;
    Integer output = 0;

    while (charPosition >= 0) {
      String charValue = Character.toString(input.charAt(charPosition));
      Integer value = conversionValues.get(charValue);

      if (value == null) {
        return null;
      }

      if (value >= 0) {
        output += value * multiplier;
      } else {
        sign *= -1;
      }

      multiplier *= 10;
      charPosition -= 1;
    }

    return sign * output;
  }

}
