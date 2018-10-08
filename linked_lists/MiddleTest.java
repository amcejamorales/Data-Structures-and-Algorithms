import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MiddleTest {
  private LinkedList list;
  private Middle middleInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    middleInstance = new Middle();
  }

  @Test
  public void testGetMiddle_onEmptyLinkedList_returnsNull() {
    Integer output = middleInstance.getMiddle(list);
    assertEquals(null, output);
  }

  @Test
  public void testGetMiddle_onLinkedListWithOneNode_returnsValueAtThatNode() {
    list.insert(10);
    Integer output = middleInstance.getMiddle(list);
    assertEquals((Integer) 10, output);
  }

  @Test
  public void testGetMiddle_onLinkedListWithTwoNodes_returnsValueAtSecondNode() {
    list.insert(10);
    list.insert(20);
    Integer output = middleInstance.getMiddle(list);
    assertEquals((Integer) 10, output);
  }

  @Test
  public void testGetMiddle_onLinkedListWithOddNumberNodes_returnsValueAtTheExactCenterNode() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    Integer output = middleInstance.getMiddle(list);
    assertEquals((Integer) 20, output);
  }

  @Test
  public void testGetMiddle_onLinkedListWithEvenNumberOfNodes_returnsValueAtNodeRightOfTheExactMiddle() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    Integer output = middleInstance.getMiddle(list);
    assertEquals((Integer) 20, output);
  }

}
