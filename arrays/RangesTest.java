import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RangesTest {
  private Ranges inst;

  @Before
  public void setup() {
    inst = new Ranges();
  }

  @Test
  public void testRanges_returnsEmptyString_givenEmptyArray() {
    String output = inst.ranges(new int[0]);
    assertEquals("", output);
  }

  @Test
  public void testRanges_returnsSingleRange_givenArrayWithContiguousElements() {
    int[] inputArray = new int[3];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    String output = inst.ranges(inputArray);
    assertEquals("1-3", output);
  }

  @Test
  public void testRanges_returnsRanges() {
    int[] inputArray = new int[9];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    inputArray[3] = 5;
    inputArray[4] = 6;
    inputArray[5] = 7;
    inputArray[6] = 9;
    inputArray[7] = 10;
    inputArray[8] = 11;
    String output = inst.ranges(inputArray);
    assertEquals("1-3, 5-7, 9-11", output);
  }

  @Test
  public void testRanges_returnsSingleDigit_givenArrayWithSingleElement() {
    int[] inputArray = new int[1];
    inputArray[0] = 1;
    String output = inst.ranges(inputArray);
    assertEquals("1", output);
  }

  @Test
  public void testRanges_returnsRangesWithSingleDigits_givenArrayWithNonContiguousElements() {
    int[] inputArray = new int[4];
    inputArray[0] = 2;
    inputArray[1] = 4;
    inputArray[2] = 6;
    inputArray[3] = 8;
    String output = inst.ranges(inputArray);
    assertEquals("2, 4, 6, 8", output);
  }

  @Test
  public void testRanges_returnsMixedRangesAndSingleDigits() {
    int[] inputArray = new int[9];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    inputArray[3] = 5;
    inputArray[4] = 7;
    inputArray[5] = 8;
    inputArray[6] = 10;
    inputArray[7] = 12;
    inputArray[8] = 13;
    String output = inst.ranges(inputArray);
    assertEquals("1-3, 5, 7-8, 10, 12-13", output);
  }

  @Test
  public void testRanges_returnsRanges_givenArrayWithDuplicateValues() {
    int[] inputArray = new int[9];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 2;
    inputArray[3] = 4;
    inputArray[4] = 4;
    inputArray[5] = 6;
    inputArray[6] = 7;
    inputArray[7] = 8;
    inputArray[8] = 10;
    String output = inst.ranges(inputArray);
    assertEquals("1-2, 4, 6-8, 10", output);
  }

}
