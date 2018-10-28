public class ArraySums {

  public ArraySums() {}

  public int[] arraySums(int[] arrayOne, int[] arrayTwo) {
    int maxLength = 0;
    if (arrayOne.length > arrayTwo.length) {
      maxLength = arrayOne.length;
    } else {
      maxLength = arrayTwo.length;
    }
    int[] outputArray = new int[maxLength];

    int index = 0;
    while (index < maxLength) {
      int sum = 0;
      if (index < arrayOne.length) {
        sum += arrayOne[index];
      }
      if (index < arrayTwo.length) {
        sum += arrayTwo[index];
      }
      outputArray[index] = sum;

      index += 1;
    }

    return outputArray;
  }

}
