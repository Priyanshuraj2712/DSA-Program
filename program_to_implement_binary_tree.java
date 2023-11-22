import java.util.Scanner;
class Node5{
    int key;
    Node5 left, right;
    public Node5(int item) {
        key = item;
        left = right = null;
    }
}
class BinaryTree {
    Node5 root;
    BinaryTree() {
        root = null;
    }
    void printInorder(Node5 node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node5 node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node5 node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node5(1);
        tree.root.left = new Node5(2);
        tree.root.right = new Node5(3);
        tree.root.left.left = new Node5(4);
        tree.root.left.right = new Node5(5);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inorder Traversal");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Postorder Traversal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inorder traversal of binary tree is ");
                    tree.printInorder(tree.root);
                    break;
                case 2:
                    System.out.println("Preorder traversal of binary tree is ");
                    tree.printPreorder(tree.root);
                    break;
                case 3:
                    System.out.println("Postorder traversal of binary tree is ");
                    tree.printPostorder(tree.root);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }
}
