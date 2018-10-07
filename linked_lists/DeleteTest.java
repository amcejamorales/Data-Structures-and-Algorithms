import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DeleteTest {
  private LinkedList list;
  private Delete deleteInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    deleteInstance = new Delete();
  }

  @Test
  public void testDelete_onEmptyLinkedList_returnsFalse() {
    boolean output = deleteInstance.delete(list, 10);
    assertEquals(false, output);
  }

  @Test
  public void testDelete_onNonEmptyLinkedList_containingGivenValue_returnsTrue_deletesFirstNodeWithValue() {
    list.insert(50);
    list.insert(20);
    list.insert(30);
    list.insert(20);
    list.insert(10);

    boolean output = deleteInstance.delete(list, 20);
    assertEquals(true, output);

    Node thirdNode = list.getHead().getNextNode().getNextNode();
    assertEquals(20, thirdNode.getValue());
  }

  @Test
  public void testDelete_onNonEmptyLinkedList_containingGivenValueAtHead_removesHead() {
    list.insert(30);
    list.insert(20);
    list.insert(10);

    boolean output = deleteInstance.delete(list, 10);
    assertEquals(true, output);
    assertEquals(20, list.getHead().getValue());
  }

  @Test
  public void testDelete_onLinkedListWithOnlyOneNode_containingGivenValueAtHead_removesHead() {
    list.insert(10);

    boolean output = deleteInstance.delete(list, 10);
    assertEquals(true, output);
    assertEquals(null, list.getHead());
  }

  @Test
  public void testDelete_onNonEmptyLinkedList_containingGivenValueAtLastNode_removesLastNode() {
    list.insert(10);
    list.insert(20);
    list.insert(30);

    boolean output = deleteInstance.delete(list, 10);
    assertEquals(true, output);

    Node secondNode = list.getHead().getNextNode();
    assertEquals(null, secondNode.getNextNode());
  }

  @Test
  public void testDelete_onNonEmptyLinkedList_notContainingGivenValue_returnsFalse() {
    list.insert(50);
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    boolean output = deleteInstance.delete(list, 60);
    assertEquals(false, output);
  }

}
