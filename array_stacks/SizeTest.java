import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SizeTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testSize_returnsZeroForEmptyStack() {
    int size = stack.size();
    assertEquals(0, size);
  }

  @Test
  public void testSize_returnsCorrectSizeForNonEmptyStack() {
    stack.push(new Node(0));
    int size = stack.size();
    assertEquals(1, size);
  }

}
