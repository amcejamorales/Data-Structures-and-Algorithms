import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EmptyTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testEmpty_returnsTrueForEmptyStack() {
    boolean empty = stack.empty();
    assertEquals(true, empty);
  }

  @Test
  public void testEmpty_returnsFalseForNonEmptyStack() {
    stack.push(new Node(0));
    boolean empty = stack.empty();
    assertEquals(false, empty);
  }

}
