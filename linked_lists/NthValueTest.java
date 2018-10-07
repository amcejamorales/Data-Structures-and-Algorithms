import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NthValueTest {
  private LinkedList list;
  private NthValue nthValueInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    nthValueInstance = new NthValue();
  }

  @Test
  public void testGetNthValue_onEmptyLinkedList_returnsNull() {
    Integer nthValue = nthValueInstance.getNthValue(list, 0);
    assertEquals(null, nthValue);
  }

  @Test
  public void testGetNthValue_onNonEmptyLinkedList_whereNIsLessThanListLength_returnsValueAtNthNode() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    Integer nthValue = nthValueInstance.getNthValue(list, 2);
    assertEquals((Integer) 10, nthValue);
  }

  @Test
  public void testGetNthValue_onNonEmptyLinkedList_whereNIsGreaterThanOrEqualToListLength_returnsNull() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    Integer nthValue = nthValueInstance.getNthValue(list, 3);
    assertEquals(null, nthValue);
  }

}
