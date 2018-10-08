public class NthFromEnd {

  public NthFromEnd() {}

  public Integer getNthFromEnd(LinkedList list, int n) {
    if (list.getHead() == null) {
      return null;
    }

    Node currentNode = list.getHead();
    Node targetNode = null;
    int nodeCount = 0;

    while (currentNode != null) {
      if (nodeCount == n) {
        targetNode = list.getHead();
      } else if (targetNode != null) {
        targetNode = targetNode.getNextNode();
      }

      currentNode = currentNode.getNextNode();
      nodeCount++;
    }

    if (targetNode == null) {
      return null;
    }

    return targetNode.getValue();
  }

}
