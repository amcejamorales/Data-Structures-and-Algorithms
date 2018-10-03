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

}
