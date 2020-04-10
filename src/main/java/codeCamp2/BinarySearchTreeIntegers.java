package codeCamp2;

class BinarySearchTreeIntegers {
    private class Node {
        int data; // value stored at the node
        Node left; // left subtree
        Node right;  // right subtree

        Node(int newdata) {
            data = newdata;
        }
    }
    private Node root; // the root of the tree

    /** Insert a given element into the BST tree */
    public void insert(int elem) {
        root = insert(root, elem);
    }

    /** Insert elem into the tree with the given root */
    private Node insert(Node tree, int elem) {
        if (tree == null) {
            return new Node(elem);
        }
        if (elem < tree.data) {
            tree.left = insert(tree.left, elem);
            return tree;
        } else {
            tree.right = insert(tree.right, elem);
            return tree;
        }
    }

    /**
     * Returns the i-th largest element in the binary search tree.  
     * @param i  which largest element we want (if i is 0, we want the largest element, if i is 1, the second largest etc.
     * @return i-th largest element
     */
   public int getValueAt(int i) {
        // FILL IN CODE
        // You are allowed to use helper method(s)



    return 0; // don't forget to change
   }

    public static void main(String[] args) {
        BinarySearchTreeIntegers tree = new BinarySearchTreeIntegers();
        tree.insert(3);
        tree.insert(4);
        tree.insert(10);
        tree.insert(20);
        tree.insert(1);
        System.out.println(tree.getValueAt(0));
    }
}
