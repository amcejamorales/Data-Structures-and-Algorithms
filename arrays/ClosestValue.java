public class ClosestValue {

  public ClosestValue() {}

  public Integer closestValue(int[] array, int value) {
    if (array.length == 0) {
      return null;
    }

    int min = 0;
    int max = array.length - 1;
    while (max > min) {
      int mid = (max + min) / 2;
      if (array[mid] == value) {
        return value;
      }

      if (max == min + 1) {
        int minDiff = value - array[min];
        int maxDiff = array[max] - value;
        if (maxDiff >= minDiff) {
          return array[min];
        } else {
          return array[max];
        }
      }

      else if (array[mid] > value) {
        max = mid - 1;
      } else if (array[mid] < value) {
        min = mid + 1;
      }
      
    }

  }

}
