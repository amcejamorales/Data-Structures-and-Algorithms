import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PrintTest {
  private LinkedList list;
  private Print printInstance;

  @Before
  public void setup() {
    list = new LinkedList();
    printInstance = new Print();
  }

  @Test
  public void testPrintList_onEmptyLinkedList_printsEmptyString() {
    String output = printInstance.print(list);
    assertEquals("", output);
  }

  @Test
  public void testPrintList_onNonEmptyLinkedList_printsNodeValues() {
    String expectedOutput = "10 20 30 40 50";
    list.insert(50);
    list.insert(40);
    list.insert(30);
    list.insert(20);
    list.insert(10);
    String output = printInstance.print(list);
    assertEquals(expectedOutput, output); 
  }

}
