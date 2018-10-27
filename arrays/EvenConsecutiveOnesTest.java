import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EvenConsecutiveOnesTest {
  private EvenConsecutiveOnes inst;

  @Before
  public void setup() {
    inst = new EvenConsecutiveOnes();
  }

  @Test
  public void testEvenConsecutiveOnes_returnsTrue_givenEvenLengthArrayWithAllOnes() {
    int[] allEvenOnes = new int[4];
    allEvenOnes[0] = 1;
    allEvenOnes[1] = 1;
    allEvenOnes[2] = 1;
    allEvenOnes[3] = 1;
    boolean output = inst.evenConsecutiveOnes(allEvenOnes);
    assertEquals(true, output);
  }

  @Test
  public void testEvenConsecutiveOnes_returnsTrue_givenEvenLengthArrayWithAllZeros() {
    int[] singleZero = new int[1];
    singleZero[0] = 0;
    int[] allEvenZeros = new int[4];
    allEvenZeros[0] = 0;
    allEvenZeros[1] = 0;
    allEvenZeros[2] = 0;
    allEvenZeros[3] = 0;

    boolean output_one = inst.evenConsecutiveOnes(singleZero);
    boolean output_two = inst.evenConsecutiveOnes(allEvenZeros);

    assertEquals(true, output_one);
    assertEquals(true, output_two);
  }

  @Test
  public void testEvenConsecutiveOnes_returnsFalse_givenAnArrayWithAnyOddSequenceOfOnes() {
    int[] singleOne = new int[1];
    singleOne[0] = 1;
    int[] oddOnes = new int[3];
    oddOnes[0] = 1;
    oddOnes[1] = 0;
    oddOnes[2] = 1;

    boolean output_one = inst.evenConsecutiveOnes(singleOne);
    boolean output_two = inst.evenConsecutiveOnes(oddOnes);

    assertEquals(false, output_one);
    assertEquals(false, output_two);
  }

  @Test
  public void testEvenConsecutiveOnes_returnsTrue_givenArrayWithAllEvenSequencesofOnes() {
    int[] inputArray = new int[6];
    inputArray[0] = 0;
    inputArray[1] = 1;
    inputArray[2] = 1;
    inputArray[3] = 0;
    inputArray[4] = 1;
    inputArray[5] = 1;

    boolean output = inst.evenConsecutiveOnes(inputArray);

    assertEquals(true, output);
  }

}
