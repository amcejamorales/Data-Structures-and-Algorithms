import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ConsecutiveSumsTest {
  private ConsecutiveSums sums;

  @Before
  public void setup() {
    sums = new ConsecutiveSums();
  }

  @Test
  public void testSums_returnsNull_givenKLargerThanArrayLength() {
    int[] output = sums.kSums(new int[5], 6);
    assertEquals(null, output);
  }

  @Test
  public void testSums_returnsNull_givenKLessThanOrEqualToZero() {
    int[] outputOne = sums.kSums(new int[5], 0);
    int[] outputTwo = sums.kSums(new int[5], -1);
    assertEquals(null, outputOne);
    assertEquals(null, outputTwo);
  }

  @Test
  public void testSums_returnsArrayWithSingleIntegerValue_givenKSameSizeAsArrayLength() {
    int[] inputArray = new int[3];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    int[] output = sums.kSums(inputArray, 3);
    assertEquals(6, output[0]);
    assertEquals(1, output.length);
  }

  @Test
  public void testSums_returnsArrayOfKConsecutiveSums() {
    int[] inputArray = new int[6];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 3;
    inputArray[3] = 4;
    inputArray[4] = 5;
    inputArray[5] = 6;
    
    int[] output = sums.kSums(inputArray, 3);

    assertEquals(6, output[0]);
    assertEquals(9, output[1]);
    assertEquals(12, output[2]);
    assertEquals(15, output[3]);
    assertEquals(4, output.length);
  }

}
