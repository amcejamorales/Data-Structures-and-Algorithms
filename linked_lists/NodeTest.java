import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
  private int value;
  private Node currentNode;
  private Node nextNode;

  @Test
  public void testNodeClass_canBeInstantiated() {
    currentNode = new Node(10);
    assertNotNull(currentNode);
  }

  @Test
  public void testGetValue_retrievesCorrectValue() {
    currentNode = new Node(10);
    int value = currentNode.getValue();
    assertEquals(10, value);
  }

}
