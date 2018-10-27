import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PairTargetSumTest {
  private PairTargetSum inst;

  @Before
  public void setup() {
    inst = new PairTargetSum();
  }

  @Test
  public void testSum_returnsNull_givenEmptyArray() {
    Boolean output = inst.pairTargetSum(new int[0], 3);
    assertEquals(null, output);
  }

  @Test
  public void testSum_returnsTrue_givenArrayWithTwoUniqueElementsThatAddUpToGivenIntegerValue() {
    int[] inputArray = new int[3];
    inputArray[0] = 1;
    inputArray[1] = 2;
    inputArray[2] = 5;
    Boolean output = inst.pairTargetSum(inputArray, 3);
    assertEquals(true, output);
  }

  @Test
  public void testSum_returnsFalse_givenArrayWithSingleCharacterThatAddsUpToGivenIntegerValue() {
    int[] inputArray = new int[3];
    inputArray[0] = 3;
    inputArray[1] = 2;
    inputArray[2] = 5;
    Boolean output = inst.pairTargetSum(inputArray, 3);
    assertEquals(false, output);
  }

  @Test
  public void testSum_returnsFalse_givenArrayWithSingleCharacterThatAddsUpToGivenIntegerValueWhenDoubled() {
    int[] inputArray = new int[3];
    inputArray[0] = 5;
    inputArray[1] = 2;
    inputArray[2] = 5;
    Boolean output = inst.pairTargetSum(inputArray, 4);
    assertEquals(false, output);
  }

}
