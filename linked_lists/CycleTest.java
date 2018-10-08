import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CycleTest {
  private LinkedList list;
  private Cycle cycleInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    cycleInstance = new Cycle();
  }

  @Test
  public void testIsCyclePresent_onEmptyLinkedList_returnsNull() {
    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(false, output);
  }

  @Test
  public void testIsCyclePresent_onLinkedListWithNoCycle_returnsFalse() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(false, output);
  }

  @Test
  public void testIsCyclePresent_onCyclycLinkedListWithOneNode_returnsTrue() {
    Node cyclicNode = new Node(10);
    cyclicNode.setNextNode(cyclicNode);
    list.setHead(cyclicNode);
    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(true, output);
  }

  @Test
  public void testIsCyclePresent_onNonEmptyCyclicLinkedList_withCycleAtEndOfList_returnsTrue() {
    Node cyclicNode = new Node(10);
    cyclicNode.setNextNode(cyclicNode);
    list.setHead(cyclicNode);
    list.insert(20);
    list.insert(30);
    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(true, output);
  }

  @Test
  public void testIsCyclePresent_onNonEmptyCyclicLinkedList_withEvenNumberOfNodesWithinCycle_returnsTrue() {
    list.insert(50);
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    Node lastNode = list.getHead();
    while (lastNode.getNextNode() != null) {
      lastNode = lastNode.getNextNode();
    }
    Node secondNode = list.getHead().getNextNode();
    assertEquals(20, secondNode.getValue());
    lastNode.setNextNode(secondNode);

    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(true, output);
  }

  @Test
  public void testIsCyclePresent_onNonEmptyCyclicLinkedList_withOddNumberOfNodesWithinCycle_returnsTrue() {
    list.insert(60);
    list.insert(50);
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    Node lastNode = list.getHead();
    while (lastNode.getNextNode() != null) {
      lastNode = lastNode.getNextNode();
    }
    Node secondNode = list.getHead().getNextNode();
    assertEquals(20, secondNode.getValue());
    lastNode.setNextNode(secondNode);

    boolean output = cycleInstance.isCyclePresent(list);
    assertEquals(true, output);
  }

}
