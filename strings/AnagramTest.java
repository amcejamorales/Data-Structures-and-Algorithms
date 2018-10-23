import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AnagramTest {
  private Anagram anagram;

  @Before
  public void setup() {
    anagram = new Anagram();
  }

  @Test
  public void testAnagram_returnsFalse_givenTwoEmptyStrings() {
    boolean output = anagram.anagram("","");
    assertEquals(false, output);
  }

  @Test
  public void testAnagram_returnsFalse_givenDifferentSizeStrings() {
    boolean output_one = anagram.anagram("a","");
    boolean output_two = anagram.anagram("","a");
    boolean output_three = anagram.anagram("abcd","e");
    boolean output_four = anagram.anagram("ab","cde");
    assertEquals(false, output_one);
    assertEquals(false, output_two);
    assertEquals(false, output_three);
    assertEquals(false, output_four);
  }

  @Test
  public void testAnagram_returnsFalse_givenNonAnagrams() {
    boolean output_one = anagram.anagram("a","b");
    boolean output_two = anagram.anagram("abcd","abce");
    boolean output_three = anagram.anagram("abcd","ebcd");
    assertEquals(false, output_one);
    assertEquals(false, output_two);
    assertEquals(false, output_three);
  }

  @Test
  public void testAnagram_returnsTrue_givenAnagrams() {
    boolean output_one = anagram.anagram("a","a");
    boolean output_two = anagram.anagram("ab","ba");
    boolean output_three = anagram.anagram("abcd","acbd");
    boolean output_four = anagram.anagram("replays","parsley");
    assertEquals(true, output_one);
    assertEquals(true, output_two);
    assertEquals(true, output_three);
    assertEquals(true, output_four);
  }

}
