package linkedLists;

/** Creates a LinkedList and calls its methods */
public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtFront(5);
        list.insertAtFront(10);
        list.insertAtFront(12);
        //list.printNodes();

        list.append(30);
        list.append(40);
        list.append(45);
        list.printNodes();

        System.out.println("find(40) = " + list.find(40));

        System.out.println("Removed element after head; passed head as the previous node");
        list.remove(list.head());
        list.printNodes();

        /*list.insert(5, 99);
        System.out.println("After inserting 99 at index 2: ");
        list.printNodes();
        */

    }
}
