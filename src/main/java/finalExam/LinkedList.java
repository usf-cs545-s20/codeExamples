package finalExam;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtFront(int elem) { // can be used for building the list
        Node newNode = new Node(elem);
        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public LinkedList sublist (int low, int high) {
        LinkedList result = new LinkedList();
        // FILL IN CODE

        return result;
    }


    class Node { // Class Node; represents one node in a linked list
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            next = null;
        }
    } // class Node

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFront(10);
        list.insertAtFront(5);
        list.insertAtFront(0);
        list.insertAtFront(1);
        list.insertAtFront(9);
        list.insertAtFront(4);
        LinkedList res = list.sublist(1, 4);

    }
}


