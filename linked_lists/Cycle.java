public class Cycle {

  public Cycle() {}

  public Boolean isCyclePresent(LinkedList list) {
    Node fastNode = list.getHead();
    Node slowNode = list.getHead();

    while (fastNode != null) {
      fastNode = fastNode.getNextNode();
      if (fastNode == slowNode) {
        return true;
      }
      if (fastNode != null) {
        slowNode = slowNode.getNextNode();
        fastNode = fastNode.getNextNode();
      }
    }

    return false;
  }

}
