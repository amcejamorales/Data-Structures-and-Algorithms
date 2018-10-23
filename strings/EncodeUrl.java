public class EncodeUrl {

  public EncodeUrl() {}

  public String encode(String input) {
    String output = "";
    int index = 0;
    while (index < input.length()) {
      char value = input.charAt(index);
      if (value == ' ') {
        output += "%20";
      } else {
        output += value;
      }
      index += 1;
    }
    return output;
  }

}
