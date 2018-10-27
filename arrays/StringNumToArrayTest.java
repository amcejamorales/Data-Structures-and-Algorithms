import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StringNumToArrayTest {
  private StringNumToArray sToA;

  @Before
  public void setup() {
    sToA = new StringNumToArray();
  }

  @Test
  public void testConvert_returnsEmptyArray_givenEmptyString() {
    int[] output = sToA.convert("");
    assertEquals(0, output.length);
  }

  @Test
  public void testConvert_returnsCorrectArray_forGivenString() {
    int[] output = sToA.convert("123");
    assertEquals(1, output[0]);
    assertEquals(2, output[1]);
    assertEquals(3, output[2]);
    assertEquals(3, output.length);
  }

  @Test
  public void testConvert_returnsNull_givenNull() {
    int[] output = sToA.convert(null);
    assertEquals(null, output);
  }

  @Test
  public void testConvert_returnsNull_givenStringContainingNonIntegerCharacters() {
    int[] output_a = sToA.convert("a");
    int[] output_a1 = sToA.convert("a1");
    int[] output_1a = sToA.convert("1a");
    int[] output_pi = sToA.convert("3.14");
    int[] output_currency = sToA.convert("£3.14");
    assertEquals(null, output_a);
    assertEquals(null, output_a1);
    assertEquals(null, output_1a);
    assertEquals(null, output_pi);
    assertEquals(null, output_currency); 
  }

}
