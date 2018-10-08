public class Reverse {

  public Reverse() {}

  public boolean reverse(LinkedList list) {
    if (list.getHead() == null) {
      return false;
    }

    Node prevNode = null;
    Node currentNode = list.getHead();
    Node nextNode = currentNode.getNextNode();

    while (nextNode != null) {
      currentNode.setNextNode(prevNode);
      prevNode = currentNode;
      currentNode = nextNode;
      nextNode = currentNode.getNextNode();
    }

    list.setHead(currentNode);

    return true;
  }

}
