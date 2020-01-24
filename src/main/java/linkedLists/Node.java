package linkedLists;
/* A class representing a node in a singly linked list */
public class Node {
    private int elem;
    private Node next;

    /** Constructs a dummy node */
    public Node() {
        this.elem  = Integer.MAX_VALUE;
        this.next = null;
    }

    /**
     * Constructs a node with the given value. Sets the next reference to null.
     * @param elem
     */
    public Node(int elem) {
        this.elem = elem;
        next = null;
    }

    /** Constructs a node with the given element and the next pointer
     *
     * @param elem
     * @param next
     */
    public Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }



    public int elem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node other) {
        next = other;
    }

    public String toString() {
        return "element:" + elem;
    }
}

