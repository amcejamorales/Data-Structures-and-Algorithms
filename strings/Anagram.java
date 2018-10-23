import java.util.Map;
import java.util.HashMap;

public class Anagram {

  public Anagram() {}

  public boolean anagram(String input_a, String input_b) {
    if (input_a.length() != input_b.length()) {
      return false;
    }

    if (input_a == "" && input_b == "") {
      return false;
    }

    Map<Character, Integer> chars_a = new HashMap<Character, Integer>();
    Map<Character, Integer> chars_b = new HashMap<Character, Integer>();

    int index_a = 0;
    int index_b = 0;

    while (index_a < input_a.length()) {
      char char_a = input_a.charAt(index_a);
      if (chars_a.get(char_a) != null) {
        int count = chars_a.get(char_a);
        chars_a.replace(char_a, count + 1);
      } else {
        chars_a.put(char_a, 1);
      }
      index_a += 1;
    }

    while (index_b < input_b.length()) {
      char char_b = input_b.charAt(index_b);
      if (chars_b.get(char_b) != null) {
        int count = chars_b.get(char_b);
        chars_b.replace(char_b, count + 1);
      } else {
        chars_b.put(char_b, 1);
      }
      index_b += 1;
    }

    for(Character entry : chars_a.keySet()) {
      Integer char_a_count = chars_a.get(entry);
      Integer char_b_count = chars_b.get(entry);
      if (char_b_count == null || char_b_count != char_a_count) {
        return false;
      }
    }

    return true;
  }

}
