public class Min {

  public Min() {}

  public int getMin(LinkedList list) {
    Node currentNode = list.getHead();

    if (currentNode == null) {
      return 0;
    }

    int min = currentNode.getValue();

    while (currentNode != null) {
      if (currentNode.getValue() < min) {
        min = currentNode.getValue();
      }
      currentNode = currentNode.getNextNode();
    }

    return min;
  }

}
