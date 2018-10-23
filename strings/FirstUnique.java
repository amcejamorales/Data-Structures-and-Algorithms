import java.util.Map;
import java.util.HashMap;

public class FirstUnique {

  public FirstUnique() {}

  public Character firstUnique(String input) {
    Map<Character, Integer> chars = new HashMap<Character, Integer>();

    int index = 0;
    while (index < input.length()) {
      Character current = input.charAt(index);
      if (chars.get(current) != null) {
        Integer count = chars.get(current);
        chars.replace(current, count + 1);
      } else {
        chars.put(current, 1);
      }
      index += 1;
    }

    index = 0;
    while (index < input.length()) {
      Character current = input.charAt(index);
      if (chars.get(current) == 1) {
        return current;
      }
      index += 1;
    }

    return null;
  }

}
