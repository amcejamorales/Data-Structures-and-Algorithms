import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StringReverseTest {
  private StringReverse stringReverse;

  @Before
  public void setup() {
    stringReverse = new StringReverse();
  }

  @Test
  public void testStringReverse_returnsEmptyString_whenGivenEmptyString() {
    String output = stringReverse.reverse("");
    assertEquals("", output);
  }

  @Test
  public void testStringReverse_returnsSingleLetter_whenGivenSingleLetter() {
    String output = stringReverse.reverse("a");
    assertEquals("a", output);
  }

  @Test
  public void testStringReverse_returnsReversedTwoLetterInput() {
    String output = stringReverse.reverse("ab");
    assertEquals("ba", output);
  }

  @Test
  public void testStringReverse_returnsReversedThreeLetterInput() {
    String output = stringReverse.reverse("abc");
    assertEquals("cba", output);
  }

  @Test
  public void testStringReverse_returnsReversedLongInput() {
    String output = stringReverse.reverse("abcdefghijklmnopqrstuvwxyz");
    assertEquals("zyxwvutsrqponmlkjihgfedcba", output); 
  }

}
