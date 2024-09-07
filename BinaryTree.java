import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Method to create the binary tree
    Node create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data (1 to stop, any other number to continue): ");
        int data = scanner.nextInt();

        if (data == 1) {
            return null; // Return null for termination condition
        }

        Node newnode = new Node(data);

        System.out.println("Creating left child of " + data);
        newnode.left = create();

        System.out.println("Creating right child of " + data);
        newnode.right = create();

        return newnode;
    }

    // Method to perform in-order traversal of the binary tree
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Method to perform pre-order traversal of the binary tree
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Method to perform post-order traversal of the binary tree
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Method to search for a given key in the binary tree
    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        // Search in the left or right subtree
        return search(root.left, key) || search(root.right, key);
    }

    // Method to start the creation of the binary tree
    void createTree() {
        root = create();
    }

    // Main method to test the binary tree implementation
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create the binary tree
        tree.createTree();

        // Display the tree using different traversals
        System.out.println("In-order traversal of the binary tree:");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("Pre-order traversal of the binary tree:");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Post-order traversal of the binary tree:");
        tree.postOrder(tree.root);
        System.out.println();

        // Search for a key in the binary tree
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to search in the binary tree: ");
        int key = scanner.nextInt();
        boolean found = tree.search(tree.root, key);
        System.out.println("Value " + key + " found: " + found);
    }
}
