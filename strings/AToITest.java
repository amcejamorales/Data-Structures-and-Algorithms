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
    Integer output_one = aToI.convertAlternative("");
    Integer output_two = aToI.convert("");
    assertEquals(null, output_one);
    assertEquals(null, output_two);
  }

  @Test
  public void testAToI_returnsIntegerValue1_givenStringValue1() {
    Integer output_one = aToI.convertAlternative("1");
    Integer output_two = aToI.convert("1");
    assertEquals((Integer) 1, output_one);
    assertEquals((Integer) 1, output_two);
  }

  @Test
  public void testAToI_returnsIntegerValue12_givenStringValue12() {
    Integer output_one = aToI.convertAlternative("12");
    Integer output_two = aToI.convert("12");
    assertEquals((Integer) 12, output_one);
    assertEquals((Integer) 12, output_two);
  }

  @Test
  public void testAToI_returnsIntegerValue123_givenStringValue123() {
    Integer output_one = aToI.convertAlternative("123");
    Integer output_two = aToI.convert("123");
    assertEquals((Integer) 123, output_one);
    assertEquals((Integer) 123, output_two);
  }

  @Test
  public void testAToI_returnsNull_givenStringWithLetters() {
    Integer output_a_one = aToI.convertAlternative("a");
    Integer output_a1_one = aToI.convertAlternative("a1");
    Integer output_1a_one = aToI.convertAlternative("1a");
    Integer output_a_two = aToI.convert("a");
    Integer output_a1_two = aToI.convert("a1");
    Integer output_1a_two = aToI.convert("1a");
    assertEquals(null, output_a_one);
    assertEquals(null, output_a1_one);
    assertEquals(null, output_1a_one);
    assertEquals(null, output_a_two);
    assertEquals(null, output_a1_two);
    assertEquals(null, output_1a_two);
  }

  @Test
  public void testAToI_returnsNegativeInteger_givenNegativeNumberString() {
    Integer neg_output_one = aToI.convertAlternative("-123");
    Integer neg_output_two = aToI.convert("-123");
    Integer expected_output  = -123;
    assertEquals(expected_output, neg_output_one);
    assertEquals(expected_output, neg_output_two); 
  }

}
