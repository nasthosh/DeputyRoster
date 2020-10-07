import java.util.Scanner;

public class Tree
{
    int count = 0;
    Node root;
    public Tree()
    {
        root = null;
    }
    public void printInorder(Node node, int id)
    {
        if (node == null)
            return;
        printInorder(node.left, id);
        count++;
        if(node.data > id){
            System.out.println(node.data + " ");
            System.out.println(node.name + " ");
        }
        printInorder(node.right, id);
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
        System.out.println("Enter the userId to check for subordinates : ");
        int idValue = scanner.nextInt();
        System.out.print("\n");
        if(idValue != 4)
            tree.printInorder(idValue);
        else
            System.out.println(" There are no subordinates ");
    }
}

