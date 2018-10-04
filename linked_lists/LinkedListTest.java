import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LinkedListTest {
  private LinkedList list;

  @Before
  public void setup() {
    list = new LinkedList();
  }

  @Test
  public void testLinkedListClass_canBeInstantiated() {
      assertNotNull(list);
  }

  @Test
  public void testLInkedListClass_isInstantiatedWithNullHeadNode() {
    Node headNode = list.getHead();
    assertEquals(null, headNode);
  }

}
