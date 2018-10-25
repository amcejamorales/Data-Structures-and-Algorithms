import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MatchingParenthesesTest {
  private MatchingParentheses matchingParens;

  @Before
  public void setup() {
    matchingParens = new MatchingParentheses();
  }

  @Test
  public void testMatch_returnsFalseForSingleParen() {
    Boolean output_one = matchingParens.match("(");
    Boolean output_two = matchingParens.match(")");
    assertEquals(false, output_one);
    assertEquals(false, output_two);
  }

  @Test
  public void testMatch_returnsFalseForMismatchedParenPair() {
    Boolean output = matchingParens.match(")(");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsFalseForOddNumberOfParens() {
    Boolean output = matchingParens.match("()(");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsFalseForLongSequenceOfMisMatchedParens() {
    Boolean output = matchingParens.match("()((()()))))");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsTrueForMatchedParenPair() {
    Boolean output = matchingParens.match("()");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsTrueForLongSequenceOfMatchingParens() {
    Boolean output = matchingParens.match("()(((()()))())");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsNull_givenEmptyString() {
    Boolean output = matchingParens.match("");
    assertEquals(null, output);
  }

  @Test
  public void testMatch_returnsNull_givenStringNotContaining() {
    Boolean output = matchingParens.match("hello world");
    assertEquals(null, output);
  }

  @Test
  public void testMatch_returnsTrueForMatchingParens_ignoresOtherCharacters() {
    Boolean output = matchingParens.match("(hello) (&( ((world)('(^)'):);)(#)%) ");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsFalseForMisMatchedParens_ignoresOtherCharacters() {
    Boolean output = matchingParens.match("(:)>( ((hi) ( :)&)*) )*)   ");
    assertEquals(false, output);
  }

}
