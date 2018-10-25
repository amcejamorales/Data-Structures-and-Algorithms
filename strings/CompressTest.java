import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CompressTest {
  private Compress compress;

  @Before
  public void setup() {
    compress = new Compress();
  }

  @Test
  public void testCompress_returnsEmptyString_givenEmptyString() {
    String output = compress.compress("");
    assertEquals("", output);
  }

  @Test
  public void testCompress_returnsSingleCharacterString_givenStringWithSingleCharacter() {
    String output = compress.compress("a");
    assertEquals("a", output);
  }

  @Test
  public void testCompress_returnsSameString_givenStringWithUniqueCharacters() {
    String output = compress.compress("abcdef");
    assertEquals("abcdef", output);
  }

  @Test
  public void testCompress_returnsCompressedString() {
    String output_one = compress.compress("aaabbcddd");
    String output_two = compress.compress("aaaaaaaaa");
    assertEquals("3a2bc3d", output_one);
    assertEquals("9a", output_two);
  }

  @Test
  public void testCompress_returnsCompressedString_givenStringWithRepeatCharacters() {
    String output = compress.compress("aaabbcdddaa");
    assertEquals("3a2bc3d2a", output);
  }

}
