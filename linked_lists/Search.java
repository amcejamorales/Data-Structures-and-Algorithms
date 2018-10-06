public class Search {

  public Search() {}

  public boolean search(LinkedList list, int value) {
    Node currentNode = list.getHead();
    while (currentNode != null) {
      if (currentNode.getValue() == value) {
        return true;
      }
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

}
