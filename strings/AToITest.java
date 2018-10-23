import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AToITest {
  private AToI aToI;

  @Before
  public void setup() {
    aToI = new AToI();
  }

  @Test
  public void testAToI_returnsNullForEmptyString() {
    Integer output = aToI.convert("");
    assertEquals(null, output);
  }

  @Test
  public void testAToI_returnsIntegerValue1_givenStringValue1() {
    Integer output = aToI.convert("1");
    assertEquals((Integer) 1, output);
  }

  @Test
  public void testAToI_returnsIntegerValue12_givenStringValue12() {
    Integer output = aToI.convert("12");
    assertEquals((Integer) 12, output);
  }

  @Test
  public void testAToI_returnsIntegerValue123_givenStringValue123() {
    Integer output = aToI.convert("123");
    assertEquals((Integer) 123, output);
  }

  @Test
  public void testAToI_returnsNull_givenStringWithLetters() {
    Integer output_a = aToI.convert("a");
    Integer output_a1 = aToI.convert("a1");
    Integer output_1a = aToI.convert("1a");
    assertEquals(null, output_a);
    assertEquals(null, output_a1);
    assertEquals(null, output_1a);
  }

}
