public class StringReverse {

  public StringReverse() {}

  // Strings are immutable in java
  // Cannot reverse an instance of class String in place 
  public String reverse(String input) {
    int back = input.length() -1;
    String output = "";

    while (back >= 0) {
      char backChar = input.charAt(back);
      output += backChar;
      back -= 1;
    }

    return output;
  }

}
