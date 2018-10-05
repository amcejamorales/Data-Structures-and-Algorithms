public class LinkedList {
  Node head;

  public LinkedList() {
    head = null;
  }

  public LinkedList(Node headNode) {
    setHead(headNode);
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node headNode) {
    head = headNode;
  }

}
