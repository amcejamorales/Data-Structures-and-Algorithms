import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LinkedListInsertTest {
  private LinkedList list;

  @Before
  public void setup() {
    list = new LinkedList();
  }

  @Test
  public void testInsert_intoEmptyLinkedList_setsTheHeadNode() {
    assertEquals(null, list.getHead());
    list.insert(10);
    assertEquals(10, list.getHead().getValue());
  }

  @Test
  public void testInsert_intoNonEmptyLinkedList_insertsNewNodeAtHead() {
    list.insert(10);
    list.insert(20);
    assertEquals(20, list.getHead().getValue());
    assertEquals(10, list.getHead().getNextNode().getValue());
  }

}
