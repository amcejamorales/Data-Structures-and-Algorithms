public class Compress {

  public Compress() {}

  public String compress(String input) {
    String output = "";
    int start = 0;
    int end = 0;

    while (start < input.length()) {
      char startChar = input.charAt(start);

      while (end < input.length() &&
        startChar == input.charAt(end)) {
        end += 1;
      }

      int diff = end - start;
      if (diff > 1) {
        output += String.valueOf(diff) + startChar;
      } else {
        output += startChar;
      }

      start = end;

    }

    return output;

  }
}
