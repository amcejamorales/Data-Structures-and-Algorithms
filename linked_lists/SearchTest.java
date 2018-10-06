import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SearchTest {
  private LinkedList list;
  private Search searchInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    searchInstance = new Search();
  }

  @Test
  public void testSearch_emptyLinkedList_returnsFalse() {
    boolean result = searchInstance.search(list, 10);
    assertEquals(false, result);
  }

  @Test
  public void testSearch_nonEmptyLinkedList_notContainingValue_returnsFalse() {
    list.insert(20);
    boolean result = searchInstance.search(list, 10);
    assertEquals(false, result);
  }

  @Test
  public void testSearch_nonEmptyLinkedList_containingValue_returnsTrue() {
    list.insert(10);
    boolean result = searchInstance.search(list, 10);
    assertEquals(true, result);
  }

}
