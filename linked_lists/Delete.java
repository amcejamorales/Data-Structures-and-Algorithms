public class Delete {

  public Delete() {}

  public boolean delete(LinkedList list, int value) {
    Node currentNode = list.getHead();
    if (currentNode == null) {
      return false;
    } else if (currentNode.getValue() == value) {
      list.setHead(currentNode.getNextNode());
      return true;
    } else {
      Node nextNode = currentNode.getNextNode();
      while (nextNode != null) {
        if (nextNode.getValue() == value) {
          currentNode.setNextNode(nextNode.getNextNode());
          return true;
        }
        currentNode = nextNode;
        nextNode = currentNode.getNextNode();
      }
    }
    return false;
  }

}
