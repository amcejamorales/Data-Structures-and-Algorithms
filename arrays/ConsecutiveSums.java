public class ConsecutiveSums {

  public ConsecutiveSums() {}

  public int[] kSums(int[] array, int k) {
    if (k <= 0) {
      return null;
    }
    if (k > array.length) {
      return null;
    }

    int outputLen = array.length - k + 1;
    int[] output = new int[outputLen];
    int outputIndex = 0;

    int index = 0;
    int maxIndex = array.length - k;

    while (index <= maxIndex) {
      int sum = 0;

      int localIndex = index;
      while (localIndex < index + k) {
        sum += array[localIndex];
        localIndex += 1;
      }

      output[outputIndex] = sum;

      index += 1;
      outputIndex += 1;
    }

    return output;
  }

}
