public class NthValue {

  public NthValue() {}

  public Integer getNthValue(LinkedList list, int position) {
    int currentPosition = 0;
    Node currentNode = list.getHead();

    while (currentNode != null) {
      if (currentPosition == position) {
        return currentNode.getValue();
      }

      currentNode = currentNode.getNextNode();
      currentPosition++;
    }

    return null;
  }

}
