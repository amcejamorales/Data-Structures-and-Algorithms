import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LinkedListHeadTest {
  private LinkedList list;
  private Node headNode;

  @Before
  public void setup() {
    list = new LinkedList();
    headNode = new Node(10);
  }

  @Test
  public void testGetHead_forEmptyLinkedList_returnsNull() {
    Node node = list.getHead();
    assertEquals(null, node);
  }

  @Test
  public void testAlternativeLinkedListConstructor_setsHead() {
    LinkedList alt_list = new LinkedList(headNode);
    assertEquals(headNode, alt_list.getHead());
  }

  @Test
  public void testSetHead_forEmptyLinkedList_setsHead() {
    list.setHead(headNode);
    assertEquals(headNode, list.getHead());
  }

  @Test
  public void testSetHead_forNonEmptyLinkedList_replacesHead() {
    list.setHead(headNode);
    Node newNode = new Node(20);
    list.setHead(newNode);
    assertEquals(newNode, list.getHead());
  }

}
