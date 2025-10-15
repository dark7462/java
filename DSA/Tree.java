public class Tree {
    public static void main(String[] args) {
        bTree b1 = new bTree();
        System.out.println("Inserting values: 50, 30, 20, 40, 70, 60, 80");
        b1.insert(50);
        b1.insert(30);
        b1.insert(20);
        b1.insert(40);
        b1.insert(70);
        b1.insert(60);
        b1.insert(80);
        b1.infix();
    }
}

class Node {
    int data;
    Node left;
    Node right;

    // Constructor to create a new Node with a given value.
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class bTree {
    Node root;
    bTree() {
        root = null;
    }
    public void insert(int val) {
        root = insertRecursive(val, root);
    }

    private Node insertRecursive(int val, Node current) {
        // If the current Node is null, we've found the spot to insert.
        if (current == null) {
            return new Node(val);
        }

        // Decide whether to go down the left or right subtree.
        if (val < current.data) {
            current.left = insertRecursive(val, current.left);
        } else if (val > current.data) {
            // We use 'else if' to avoid inserting duplicate values.
            current.right = insertRecursive(val, current.right);
        }

        // Return the unchanged Node pointer.
        return current;
    }

    public void infix() {
        System.out.println("\nIn-order traversal (sorted order):");
        infixRecursive(root);
        System.out.println(); // Print a newline for better formatting.
    }

    private void infixRecursive(Node current) {
        // Base case: if the Node is null, do nothing.
        if (current == null) {
            return;
        }
        infixRecursive(current.left);
        System.out.print(current.data + " ");
        infixRecursive(current.right);
    }
}