public class Ranges {

  public Ranges() {}

  public String ranges(int[] array) {
    String output = "";
    int index = 0;

    while (index < array.length) {
      int localIndex = index + 1;

      while (
        (localIndex < array.length) &&
        (array[localIndex] - array[localIndex - 1] <= 1)
      ) {
        localIndex += 1;
      }

      if (localIndex - index == 1 || array[localIndex - 1] == array[index]) {
        output += String.valueOf(array[index]);
      } else {
        output += String.valueOf(array[index]) + "-" + String.valueOf(array[localIndex - 1]);
      }

      if (localIndex < array.length) {
        output += ", ";
      }

      index = localIndex;
    }

    return output;
  }

}
