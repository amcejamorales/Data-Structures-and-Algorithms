import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ReverseTest {
  private LinkedList list;
  private Reverse reverseInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    reverseInstance = new Reverse();
  }

  @Test
  public void testReverse_onEmptyLinkedList_returnsFalse() {
    boolean output = reverseInstance.reverse(list);
    assertEquals(false, output);
  }

  @Test
  public void testReverse_onListWithOneNode_returnsTrue() {
    list.insert(10);
    boolean output = reverseInstance.reverse(list);
    assertEquals(true, output);
  }

  @Test
  public void testReverse_onListWithTwoNodes_returnsTrue_reversesList() {
    list.insert(10);
    list.insert(20);
    assertEquals(20, list.getHead().getValue());

    boolean output = reverseInstance.reverse(list);
    assertEquals(true, output);
    assertEquals(10, list.getHead().getValue()); 
  }

  @Test
  public void testReverse_onListWithThreeNodes_returnsTrue_reversesList() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    assertEquals(30, list.getHead().getValue());

    boolean output = reverseInstance.reverse(list);
    assertEquals(true, output);
    assertEquals(10, list.getHead().getValue());
  }

}
