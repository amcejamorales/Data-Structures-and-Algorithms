public class Stack {
  private Node array[];
  private int insertAt;

  public Stack () {
    array = new Node[10];
    insertAt = 0;
  }

  public Node top() {
    return null;
  }

  public void push(Node node) {
    array[insertAt] = node;
  }

  public boolean empty() {
    return array[0] == null;
  }

}
