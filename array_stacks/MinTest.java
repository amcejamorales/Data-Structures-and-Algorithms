import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.Integer;

public class MinTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testMin_returnsNullForEmptyStack() {
    Integer min = stack.min();
    assertEquals(null, min);
  }

  @Test
  public void testMin_returnsCorrectMinimumForStackWithOneNode() {
    stack.push(new Node(0));
    Integer min = stack.min();
    assertEquals((Integer) 0, min);
  }

  @Test
  public void testMin_returnsCorrectMinimumForNonEmptyStack() {
    stack.push(new Node(1));
    stack.push(new Node(2));
    stack.push(new Node(3));
    Integer min = stack.min();
    assertEquals((Integer) 1, min);
  }

}
