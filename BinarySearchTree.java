import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Method to insert a new key in the binary search tree
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in the binary search tree
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to search for a given key in the binary search tree
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A utility function to search for a given key in the binary search tree
    boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        // Key is greater than root's key
        if (key > root.data) {
            return searchRec(root.right, key);
        }

        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // Main method to test the binary search tree implementation
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        // Insert some nodes
        System.out.println("Insert nodes into the BST:");
        System.out.print("Enter number of nodes to insert: ");
        int numNodes = scanner.nextInt();
        System.out.println("Enter " + numNodes + " values to insert:");
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        // Search for a specific key
        System.out.print("Enter value to search in the BST: ");
        int key = scanner.nextInt();
        boolean found = tree.search(key);
        System.out.println("Value " + key + " found: " + found);
    }
}
