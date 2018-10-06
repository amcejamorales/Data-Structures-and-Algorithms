import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MaxTest {
  private LinkedList list;
  private Max maxInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    maxInstance = new Max();
  }

  @Test
  public void testGetMax_onEmptyLinkedList_returnsZero() {
    int max = maxInstance.getMax(list);
    assertEquals(0, max);
  }

  @Test
  public void testGetMax_onNonEmptyLinkedList_returnsMaxIntValueInList() {
    list.insert(10);
    list.insert(20);
    list.insert(30);
    int max = maxInstance.getMax(list);
    assertEquals(30, max);
  }

}
