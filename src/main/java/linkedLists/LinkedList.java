package linkedLists;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** A class representing a linked list.*/
public class LinkedList {
    private Node head, tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public Node head() {
        return head;
    }

    public Node tail() {
        return tail;
    }

    /** Inserts a new node to the front of the list */
    public void insertAtFront(int elem) {
        Node newNode = new Node(elem);
        if (head != null) {
            newNode.setNext(head);
        } else { //both head and tail were null before
            tail = newNode;
        }
        head = newNode;
    }

    /**
     * Creates a new node with the given element and
     * adds it to the back of the list
     */
    public void append(int elem) {
        Node newNode = new Node(elem);
        if (tail != null) {
            tail.setNext(newNode);
            tail = newNode;
        } else { //both head and tail were null before
            head = tail = newNode;
        }

    }

    /** Prints all the nodes in the link list */
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.elem());
            current = current.next();
        }

    }

    /** Return true if the given element is in the list
     *
     * @param elem element to search
     * @return true, if found the element and false otherwise
     */
    public boolean find(int elem) {
        Node current = head;
        while (current != null) {
            if (current.elem() == elem) {
                return true;
            }
            current = current.next();

        }
        return false;
    }

    /**
     * Remove the node after "previousNode".
     * Return the value of the element at
     * the deleted node
     */
    public int remove(Node previousNode) {
        if ((previousNode == null) || (previousNode.next() == null)) {
            System.out.println("Nothing to remove");
            return Integer.MAX_VALUE;
            // would be better to throw new IllegalArgumentException();
        }
        int elem = previousNode.next().elem();

        // if removing the tail
        if (previousNode.next() == tail) {
            tail = previousNode;
            tail.setNext(null);

        } else {
            // delete node
            previousNode.setNext(previousNode.next().next());
        }

        return elem;
    }

    /**
     * Insert a node at the given index
     * @param index index where to insert the node
     * @param elem element to insert
     */
    public void insert(int index, int elem) {
        Node newNode = new Node(elem);
        if (index == 0) { // inserting at the head
            insertAtFront(elem);
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index  - 1 ) {
            current = current.next();
            count++;
        }
        // Now have the reference to the previous node
        if (current != null) {
            newNode.setNext(current.next());
            current.setNext(newNode);
        }
        else {
            System.out.println("Invalid index, nothing is inserted");
            return; // note: it would be best to throw an exception here
        }
    }

    public Iterator iterator() {
        return new InnerIterator(0);
    }

    public Iterator iterator(int i) {
        return new InnerIterator(i);
    }

    private class InnerIterator implements Iterator {

        private Node nextNode;  // "next" node (really a current node)

        public InnerIterator(int index) {
            nextNode = head;
            for (int i = 0; i < index; i++) {
                nextNode = nextNode.next();
            }
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        /** Return the value of the node right after current */
        public Object next() {
            if (!hasNext()) {
                System.out.println("No next element");
                throw new NoSuchElementException();
            }
            int elem = nextNode.elem();
            nextNode = nextNode.next();
            return elem;
        }
        // How would you implement add and remove methods for this iterator?
        // Not shown here

    }
}


