import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FirstUniqueTest {
  private FirstUnique firstUnique;

  @Before
  public void setup() {
    firstUnique = new FirstUnique();
  }

  @Test
  public void testFirstUnique_returnsNull_givenEmptyString() {
    Character output = firstUnique.firstUnique("");
    assertEquals(null, output);
  }

  @Test
  public void testFirstUnique_returnsOnlyCharacter_givenStringWithOneCharacter() {
    Character output = firstUnique.firstUnique("a");
    assertEquals((Character)'a', output);
  }

  @Test
  public void testFirstUnique_returnsFirstCharacter_givenStringWithTwoDifferentCharacters() {
    Character output = firstUnique.firstUnique("ab");
    assertEquals((Character)'a', output);
  }

  @Test
  public void testFirstUnique_returnsNull_givenStringWithAllSameCharacters() {
    Character output = firstUnique.firstUnique("aa");
    assertEquals(null, output);
  }

  @Test
  public void testFirstUnique_returnsFirstUniqueCharacter_givenStringWithDuplicateCharacters() {
    Character output = firstUnique.firstUnique("abacbcdedeh");
    assertEquals((Character)'h', output);
  }

}
