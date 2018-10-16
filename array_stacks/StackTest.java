import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StackTest {
  private Stack stack;

  @Before
  public void setup() {
    stack = new Stack();
  }

  @Test
  public void testStackClass_canBeInstantiated() {
    assertNotNull(stack);
  }

  @Test
  public void testStackClass_isInstantiatedWithNullTopNode() {
    Node top = stack.top();
    assertEquals(null, top);
  }

}
