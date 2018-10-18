import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.Integer;

public class MaxTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testMax_returnsNullForEmptyStack() {
    Integer max = stack.max();
    assertEquals(null, max);
  }

  @Test
  public void testMax_returnsCorrectMaximumForStackWithOneNode() {
    stack.push(new Node(0));
    Integer max = stack.max();
    assertEquals((Integer) 0, max);
  }

  @Test
  public void testMax_returnsCorrectMaximumForNonEmptyStack() {
    stack.push(new Node(1));
    stack.push(new Node(2));
    stack.push(new Node(3));
    Integer max = stack.max();
    assertEquals((Integer) 3, max);
  }

}
