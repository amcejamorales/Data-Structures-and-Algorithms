import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PalindromeTest {
  private Palindrome palindrome;

  @Before
  public void setup() {
    palindrome = new Palindrome();
  }

  @Test
  public void testPalindrome_returnsFalseForEmptyString() {
    boolean output = palindrome.palindrome("");
    assertEquals(false, output);
  }

  @Test
  public void testPalindrome_returnsTrueForStringWithSingleCharacter() {
    boolean output = palindrome.palindrome("a");
    assertEquals(true, output);
  }

  @Test
  public void testPalindrome_returnsTrueForStringWithTwoSameCharacters() {
    boolean output = palindrome.palindrome("aa");
    assertEquals(true, output);
  }

  @Test
  public void testPalindrome_returnsFalseForStringWithTwoDifferentCharacters() {
    boolean output = palindrome.palindrome("ab");
    assertEquals(false, output);
  }

  @Test
  public void testPalindrome_returnsTrueForActualPalindrome() {
    boolean output_even = palindrome.palindrome("noon");
    boolean output_odd = palindrome.palindrome("kayak");
    assertEquals(true, output_even);
    assertEquals(true, output_odd);
  }

  @Test
  public void testPalindrome_returnsTrueForNonPalindrome() {
    boolean output = palindrome.palindrome("apple");
    assertEquals(false, output);
  }

}
