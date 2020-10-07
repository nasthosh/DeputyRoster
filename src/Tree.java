import java.util.Scanner;

public class Tree
{
    Node root;
    public Tree()
    {
        root = null;
    }
    public void printInorder(Node node, int id)
    {
        if (node == null)
            return;
        printInorder(node.left, id); // Traverse the left node recursively
        if(node.data > id){
            System.out.println(node.data);
            System.out.println(node.name);
        }
        printInorder(node.right, id); // Traverse the right node recursively
    }

    public void printInorder(int id){
        printInorder(root,id);
    }

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(2, "Manager", 4); // User 1
        tree.root.right = new Node(4, "Employee",2); // User 2
        tree.root.right.left = new Node(3, "Supervisor",3); // User 3
        tree.root.left = new Node(1, "Admin", 1); // User 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the userId to check for subordinates : "); // Get the user input for the user ID
        int idValue = scanner.nextInt();
        System.out.print("\n");
        if(idValue != 4)
            tree.printInorder(idValue);
        else
            System.out.println(" There are no subordinates ");
    }
}

