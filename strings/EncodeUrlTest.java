import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EncodeUrlTest {
  private EncodeUrl encodeUrl;

  @Before
  public void setup() {
    encodeUrl = new EncodeUrl();
  }

  @Test
  public void testEncodeUrl_returnsEmptyString_givenEmptyString() {
    String output = encodeUrl.encode("");
    assertEquals("", output);
  }

  @Test
  public void testEncodeUrl_returnsEncodedValue_givenStringWithSingleSpace() {
    String output = encodeUrl.encode(" ");
    assertEquals("%20", output);
  }

  @Test
  public void testEncodeUrl_returnsString_givenStringWithNoSpaces() {
    String output = encodeUrl.encode("www.example.com");
    assertEquals("www.example.com", output);
  }

  @Test
  public void testEncodeUrl_returnsStringWithSpacesReplacedWithEncodedValuegivenStringWithSpaceAtMiddle() {
    String output = encodeUrl.encode("www.ex ample.com");
    assertEquals("www.ex%20ample.com", output);
  }

  @Test
  public void testEncodeUrl_returnsStringWithSpacesReplacedWithEncodedValue_givenStringWithSpaceAtBeginning() {
    String output = encodeUrl.encode(" www.example.com");
    assertEquals("%20www.example.com", output);
  }

  @Test
  public void testEncodeUrl_returnsStringWithSpacesReplacedWithEncodedValue_givenStringWithSpaceAtEnd() {
    String output = encodeUrl.encode("www.example.com ");
    assertEquals("www.example.com%20", output);
  }

  @Test
  public void testEncodeUrl_returnsStringWithSpacesReplacedWithEncodedValue_givenStringWithMultipleSpaces() {
    String output = encodeUrl.encode(" www . exa mple . com ");
    assertEquals("%20www%20.%20exa%20mple%20.%20com%20", output); 
  }

}
