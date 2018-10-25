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
    boolean output_one = matchingParens.match("(");
    boolean output_two = matchingParens.match(")");
    assertEquals(false, output_one);
    assertEquals(false, output_two);
  }

  @Test
  public void testMatch_returnsFalseForMismatchedParenPair() {
    boolean output = matchingParens.match(")(");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsFalseForOddNumberOfParens() {
    boolean output = matchingParens.match("()(");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsFalseForLongSequenceOfMisMatchedParens() {
    boolean output = matchingParens.match("()((()()))))");
    assertEquals(false, output);
  }

  @Test
  public void testMatch_returnsTrueForMatchedParenPair() {
    boolean output = matchingParens.match("()");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsTrueForLongSequenceOfMatchingParens() {
    boolean output = matchingParens.match("()(((()()))())");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsTrueForMatchingParens_ignoresOtherCharacters() {
    boolean output = matchingParens.match("(hello) (&( ((world)('(^)'):);)(#)%) ");
    assertEquals(true, output);
  }

  @Test
  public void testMatch_returnsFalseForMisMatchedParens_ignoresOtherCharacters() {
    boolean output = matchingParens.match("(:)>( ((hi) ( :)&)*) )*)   ");
    assertEquals(false, output);
  }

}
