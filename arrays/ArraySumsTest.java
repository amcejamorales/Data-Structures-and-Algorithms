import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ArraySumsTest {
  private ArraySums inst;

  @Before
  public void setup() {
    inst = new ArraySums();
  }

  @Test
  public void testArraySums_returnsEmptyArray_givenEmptyArrays() {
    int[] output = inst.arraySums(new int[0], new int[0]);
    assertEquals(0, output.length);
  }

  @Test
  public void testArraySums_returnsNonEmptyArray_givenOneEmptyArray() {
    int[] nonEmptyArray = new int[1];
    nonEmptyArray[0] = 0;
    int[] outputOne = inst.arraySums(new int[0], nonEmptyArray);
    int[] outputTwo = inst.arraySums(nonEmptyArray, new int[0]);
    assertEquals(1, outputOne.length);
    assertEquals(1, outputTwo.length);
  }

  @Test
  public void testArraySums_returnsArrayOfSums() {
    int[] arrayOne = new int[3];
    int[] arrayTwo = new int[3];
    arrayOne[0] = 1;
    arrayOne[1] = 2;
    arrayOne[2] = 3;
    arrayTwo[0] = 4;
    arrayTwo[1] = 5;
    arrayTwo[2] = 6;

    int[] outputOne = inst.arraySums(arrayOne, arrayTwo);

    assertEquals(3, outputOne.length);
    assertEquals(5, outputOne[0]);
    assertEquals(7, outputOne[1]);
    assertEquals(9, outputOne[2]);
  }

  @Test
  public void testArraySums_returnsArrayOfSumsWithLengthEqualToLargestGivenArray_givenDifferentSizeArrays() {
    int[] arrayOne = new int[4];
    int[] arrayTwo = new int[2];
    arrayOne[0] = 1;
    arrayOne[1] = 2;
    arrayOne[2] = 3;
    arrayOne[3] = 4;
    arrayTwo[0] = 5;
    arrayTwo[1] = 6;

    int[] outputOne = inst.arraySums(arrayOne, arrayTwo);

    assertEquals(4, outputOne.length);
    assertEquals(6, outputOne[0]);
    assertEquals(8, outputOne[1]);
    assertEquals(3, outputOne[2]);
    assertEquals(4, outputOne[3]);
  }

}
