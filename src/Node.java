
public class Node {
    int data;
    String name;
    int id;
    Node left, right;

    public Node(int data, String name, int id)
    {
        this.data = data;
        this.name = name;
        this.id = id;
        left = right = null;
    }
}
