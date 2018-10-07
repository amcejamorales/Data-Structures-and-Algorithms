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

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.setNextNode(head);
    head = newNode;
  }

  public void insertAscending(int value) {
    Node currentNode = head;

    if (currentNode == null) {
      head = new Node(value);
    } else if (value <= currentNode.getValue()) {
      Node newNode = new Node(value);
      newNode.setNextNode(head);
      head = newNode;
    } else {
      Node nextNode = currentNode.getNextNode();
      while (nextNode != null) {
        if (currentNode.getValue() <= value && nextNode.getValue() >= value) {
          Node newNode = new Node(value);
          currentNode.setNextNode(newNode);
          newNode.setNextNode(nextNode);
        }
        currentNode = nextNode;
        nextNode = currentNode.getNextNode();
      }

      if (currentNode.getValue() <= value) {
        currentNode.setNextNode(new Node(value));
      }
    }

  }

}
