public class Middle {

  public Middle() {}

  public Integer getMiddle(LinkedList list) {
    if (list.getHead() == null) {
      return null;
    }
    
    Node fastNode = list.getHead();
    Node slowNode = list.getHead();

    while (fastNode != null) {
      fastNode = fastNode.getNextNode();
      if (fastNode != null) {
        slowNode = slowNode.getNextNode();
        fastNode = fastNode.getNextNode();
      }
    }

    return slowNode.getValue();
  }

}
