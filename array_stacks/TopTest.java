import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TopTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testTop_returnsNullForEmptyStack() {
    Node top = stack.top();
    assertEquals(null, top);
  }

  @Test
  public void testTop_returnsCorrectNodeForStackWithOneNode() {
    Node topNode = new Node(0);
    stack.push(topNode);
    Node top = stack.top();
    assertEquals(topNode, top);
  }

  @Test
  public void testTop_returnsCorrectNodeForNonEmptyStack() {
    Node topNode = new Node(0);
    stack.push(new Node(10));
    stack.push(new Node(10));
    stack.push(new Node(10));
    stack.push(topNode);
    Node top = stack.top();
    assertEquals(topNode, top);
  }

}
