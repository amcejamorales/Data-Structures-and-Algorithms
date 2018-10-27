public class StringNumToArray {

  public StringNumToArray() {}

  public int[] convert(String numbers) {
    if (numbers == null) {
      return null;
    }

    int outputLength = numbers.length();
    int[] outputArray = new int[outputLength];
    int outputIndex = 0;
    int stringIndex = 0;

    while (stringIndex < outputLength) {
      int value = numbers.charAt(stringIndex) - '0';

      if (value < 0 || value > 9) {
        return null;
      }

      outputArray[outputIndex] = value;
      
      stringIndex += 1;
      outputIndex += 1;
    }

    return outputArray;
  }

}
