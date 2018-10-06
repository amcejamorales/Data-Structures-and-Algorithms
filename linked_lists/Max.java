public class Max {

  public Max() {}

  public int getMax(LinkedList list) {
    Node currentNode = list.getHead();

    if (currentNode == null) {
      return 0;
    }

    int max = currentNode.getValue();

    while (currentNode != null) {
      if (currentNode.getValue() > max) {
        max = currentNode.getValue();
      }
      currentNode = currentNode.getNextNode();
    }

    return max;
  }

}
