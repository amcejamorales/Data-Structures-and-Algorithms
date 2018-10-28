import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ClosestValueTest {
  private ClosestValue inst;

  @Before
  public void setup() {
    inst = new ClosestValue();
  }

  @Test
  public void testClosestValue_returnsNull_givenEmptyArray() {
    Integer output = inst.closestValue(new int[0], 5);
    assertEquals(null, output);
  }

  @Test
  public void testClosestValue_returnsValue_givenArrayContainingValue() {
    int[] inputArray = new int[5];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    inputArray[3] = 4;
    inputArray[4] = 5;
    Integer output = inst.closestValue(inputArray, 5);
    assertEquals((Integer) 5, output);
  }

  @Test
  public void testClosestValue_returnsClosestElementValueInArray_givenArrayNotContainingValue() {
    int[] inputArray = new int[5];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    inputArray[3] = 5;
    inputArray[4] = 8;
    Integer output = inst.closestValue(inputArray, 6);
    assertEquals((Integer) 5, output);
  }

  @Test
  public void testClosestValue_returnsClosestElementValueInArray_givenValueLessThanSmallestElementValue() {
    int[] inputArray = new int[5];
    inputArray[0] = 2;
    inputArray[1] = 3;
    inputArray[2] = 4;
    inputArray[3] = 5;
    inputArray[4] = 6;
    Integer output = inst.closestValue(inputArray, 1);
    assertEquals((Integer) 2, output);
  }

  @Test
  public void testClosestValue_returnsClosestElementValueInArray_givenValueGreaterThanLargestElementValue() {
    int[] inputArray = new int[5];
    inputArray[0] = 2;
    inputArray[1] = 3;
    inputArray[2] = 4;
    inputArray[3] = 5;
    inputArray[4] = 6;
    Integer output = inst.closestValue(inputArray, 7);
    assertEquals((Integer) 6, output);
  }

  @Test
  public void testClosestValue_returnsSmallerValue_givenValueThatFallsExactlyBetweenTwoValuesInArray() {
    int[] inputArray = new int[5];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 4;
    inputArray[3] = 5;
    inputArray[4] = 6;
    Integer output = inst.closestValue(inputArray, 3);
    assertEquals((Integer) 2, output);
  }

}
