import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MinTest {
  private LinkedList list;
  private Min minInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    minInstance = new Min();
  }

  @Test
  public void testGetMin_onEmptyLinkedList_returnsZero() {
    int min = minInstance.getMin(list);
    assertEquals(0, min);
  }

  @Test
  public void testGetMin_onNonEmptyLinkedList_returnsMinIntValueInList() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    int min = minInstance.getMin(list);
    assertEquals(10, min);
  }

}
