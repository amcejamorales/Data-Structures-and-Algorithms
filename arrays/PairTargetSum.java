public class PairTargetSum {

  public PairTargetSum() {}

  public Boolean pairTargetSum(int[] array, int target) {
    if (array.length == 0) {
      return null;
    }

    int index = 0;
    while (index < array.length) {
      int value = array[index];
      int localIndex = index + 1;

      while (localIndex < array.length) {
        if (array[index] + array[localIndex] == target) {
          return true;
        }
        localIndex += 1;
      }

      index += 1;
    }

    return false;
  }

}
