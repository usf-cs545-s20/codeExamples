package linkedLists;

import java.util.ListIterator; // we want to implement more methods than hasNext() and next()

/** A Linked List with the dummy head */
public class LinkedListWithDummy {
    private Node head, tail;

    /** Creates an empty linked list with a dummy head */
    public LinkedListWithDummy() {
        head = new Node();
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
        if (tail == null) {
            tail = newNode;
        }
        newNode.setNext(head.next());
        head.setNext(newNode);
    }

    /**
     * Creates a new node with the given element and
     * adds it to the back of the list
     */
    public void append(int elem) {
        Node newNode = new Node(elem);
        if (tail != null) {
            tail.setNext(newNode);
        } else { // first "real" element (not counting a dummy head)
            head.setNext(newNode);
        }
        tail = newNode;

    }

    /** Prints all the nodes in the link list */
    public void printNodes() {
        Node current = head.next(); // do not want to print the dummy, only real nodes
        while (current != null) {
            System.out.println(current.elem());
            current = current.next();
        }
    }

    /** Remove the node after "previousNode".
     * Return the value of the element at the deleted node
     *
     * @param previousNode previous node
     * @return deleted value
     */
    public int remove(Node previousNode) {
        if ((previousNode == null) || (previousNode.next() == null)) {
            throw new IllegalArgumentException();
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
     * Returns the iterator starting at a given index
     * @param index
     * @return
     */
    public ListIterator iterator(int index) {
        return new InnerIterator(index);
    }

    // Inner class: InnerIterator
    private class InnerIterator implements ListIterator {

        /*----------------------------------------------------- */
        /* Private Data Members -- InnerIterator */
        /*----------------------------------------------------- */
        private Node current;  // the node before "next"
        private Node previous; // the node before current

        /*----------------------------------------------------- */
        /* Constructor -- InnerIterator */
        /*----------------------------------------------------- */
        public InnerIterator(int index) {
            previous = null;
            // if index is 0, current will point at a dummy head
            current = head; // current will point at a node at index - 1
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next();
            }
        }

        /*----------------------------------------------------- */
        /* Public Methods -- InnerIterator */
        /*----------------------------------------------------- */
        public Integer previous() {
            if (!hasPrevious()) {
                System.out.println("No previous element");
                return null;
            }
            int previousVal = current.elem();
            previous = null;
            Node oldCurrent = current;
            current = head;
            while (current.next() != oldCurrent) {
                previous = current;
                current = current.next();
            }
            return previousVal;
        }


        public boolean hasPrevious() {
            return current != head && current != null;
        }

        public boolean hasNext() {
            return current != null && current.next() != null;
        }

        /** Return the value of the node right after current */
        public Object next() {
            if (!hasNext()) {
                System.out.println("No next element");
                return null;
            }
            previous = current;
            current = current.next();
            return current.elem();
        }

        /** Remove current (the element before "next")
         *  Can only be called once per call to next or previous.
         */
        public void remove() {
            if (previous == null || current == null) {
                System.out.println("Can not remove. ");
                return;
            }
            current = previous;
            previous.setNext(previous.next().next());
            previous = null; // Note: we won't be able to call
            // remove again until we call next() or previous

        }

        /** Insert the element right before "next"
         *
         * @param elem the element to insert
         */
        public void add(Object elem) {
            if (current == null) {
                System.out.println("Iterator not in list");
                return;
            }
            current.setNext(new Node((int)elem, current.next()));
            previous = current;
            current = current.next();
        }


        // Methods below are currently not implemented; we chose to concentrate on other methods
        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(Object o) {
            throw new UnsupportedOperationException();
        }
    }
}

