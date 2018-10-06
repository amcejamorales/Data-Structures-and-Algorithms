public class Count {

  public Count() {}

  public int getNodeCount(LinkedList list) {
    int count = 0;

    Node currentNode = list.getHead();

    while (currentNode != null) {
      count++;
      currentNode = currentNode.getNextNode();
    }

    return count;
  }

}
