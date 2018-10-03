import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NodeTest {
  private int value;
  private Node currentNode;

  @Before
  public void setup() {
    value = 10;
    currentNode = new Node(value);
  }

  @Test
  public void testNodeClass_canBeInstantiated() {
    assertNotNull(currentNode);
  }

  @Test
  public void testGetValue_retrievesCorrectValue() {
    int retrievedValue = currentNode.getValue();
    assertEquals(value, retrievedValue);
  }

  @Test
  public void testGetNextNode_retrievesCorrectNextNode() {
    Node retrievedNextNode = currentNode.getNextNode();
    assertEquals(null, retrievedNextNode);
  }

  @Test
  public void testSetNextNode() {
    Node nextNode = new Node(20);

    currentNode.setNextNode(nextNode);

    assertEquals(nextNode, currentNode.getNextNode());
  }

}
