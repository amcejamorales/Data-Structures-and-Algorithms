import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NthFromEndTest {
  private LinkedList list;
  private NthFromEnd nthFromEndInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    nthFromEndInstance = new NthFromEnd();
  }

  @Test
  public void testGetNthFromEnd_onEmptyLinkedList_returnsNull() {
    Integer output = nthFromEndInstance.getNthFromEnd(list, 0);
    assertEquals(null, output);
  }

  @Test
  public void testGetNthFromEnd_onLinkedListWithOneNode_suchThatNIsZero_returnsHeadValue() {
    list.insert(10);
    Integer output = nthFromEndInstance.getNthFromEnd(list, 0);
    assertEquals((Integer) 10, output);
  }

  @Test
  public void testGetNthFromEnd_onNonEmptyLinkedList_suchThatNIsLessThanListLength_returnsApproriateNodeValue() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);

    Integer output = nthFromEndInstance.getNthFromEnd(list, 2);
    assertEquals((Integer) 30, output);
  }

  @Test
  public void testGetNthFromEnd_onNonEmptyLinkedList_suchThanNIsZero_returnsLastNodeValue() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    Integer output = nthFromEndInstance.getNthFromEnd(list, 0);
    assertEquals((Integer) 10, output);
  }

  @Test
  public void testGetNthFromEnd_onNonEmptyLinkedList_suchThatNIsGreaterThanOrEqualToLength_returnsNull() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    Integer output = nthFromEndInstance.getNthFromEnd(list, 5);
    assertEquals(null, output);
  }

}
