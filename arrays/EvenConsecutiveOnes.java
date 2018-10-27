public class EvenConsecutiveOnes {

  public EvenConsecutiveOnes() {}

  public boolean evenConsecutiveOnes(int[] array) {
    int index = 0;
    while (index < array.length) {
      if (array[index] == 1) {

        int localIndex = index + 1;
        while (localIndex < array.length && array[localIndex] == 1) {
          localIndex += 1;
        }

        if ((localIndex - index) % 2 != 0) {
          return false;
        }

        index = localIndex; 
      }
      index += 1;
    }

    return true;
  }

}
