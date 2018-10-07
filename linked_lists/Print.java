public class Print {

  public Print() {}

  public String print(LinkedList list) {
    String output = "";
    Node currentNode = list.getHead();
    while (currentNode != null) {
      output += currentNode.getValue() + " ";
      currentNode = currentNode.getNextNode();
    }
    output = output.trim();
    System.out.print(output);
    return output;
  }

}
