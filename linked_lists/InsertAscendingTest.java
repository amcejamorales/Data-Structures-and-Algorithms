import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class InsertAscendingTest {
  private LinkedList list;

  @Before
  public void setup() {
    list = new LinkedList();
  }

  @Test
  public void testInsertAscending_intoEmptyLinkedList_setsTheHeadNode() {
    assertEquals(null, list.getHead());
    list.insertAscending(10);
    assertEquals(10, list.getHead().getValue());
  }

  @Test
  public void testInsertAscending_intoNonEmptyLinkedList_insertsNewNodeInTheCorrectPosition() {
    list.insert(50);
    list.insert(40);
    list.insert(20);
    list.insert(10);
    assertEquals(10, list.getHead().getValue());
    list.insertAscending(30);
    Node thirdNode = list.getHead().getNextNode().getNextNode();
    assertEquals(30, thirdNode.getValue());
  }

  @Test
  public void testInsertAscending_valueLessThanHead_intoNonEmptyLinkedList() {
    list.insert(10);
    list.insertAscending(5);
    assertEquals(5, list.getHead().getValue());
  }

  @Test
  public void testInsertAscending_valueAtEndOfNonEmptyLinkedList() {
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    list.insertAscending(50);
    Node fifthNode = list.getHead().getNextNode().getNextNode().getNextNode().getNextNode();
    assertEquals(50, fifthNode.getValue());
  }
  
}
