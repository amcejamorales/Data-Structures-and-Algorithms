import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CountTest {
  private LinkedList list;
  private Count countInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    countInstance = new Count();
  }

  @Test
  public void testGetNodeCount_onEmptyLinkedList_returnsZero() {
    int nodeCount = countInstance.getNodeCount(list);
    assertEquals(0, nodeCount);
  }

  @Test
  public void testGetNodeCount_onNonEmptyLinkedList_returnsNumberOfNodesInLinkedList() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    int nodeCount = countInstance.getNodeCount(list);
    assertEquals(3, nodeCount);
  }

}
