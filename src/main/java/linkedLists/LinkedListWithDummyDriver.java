package linkedLists;

import java.util.ListIterator;

/** Creates a LinkedList and calls its methods */
public class LinkedListWithDummyDriver {
    public static void main(String[] args) {
        LinkedListWithDummy listD = new LinkedListWithDummy();

        listD.insertAtFront(5);
        listD.insertAtFront(10);
        listD.insertAtFront(12);
        System.out.println("After inserting 5, then 10 and 12 in front of the list");
        listD.printNodes();

        listD.append(30);
        listD.append(40);
        listD.append(45);
        System.out.println("After appending 30, 40 and 45");
        listD.printNodes();
        System.out.println(listD.tail());

        System.out.println("Removed element after head; passed head as the previous node");
        listD.remove(listD.head());
        listD.printNodes();

        System.out.println("Iterating using the iterator after inserting 67 in front of 30: ");
        ListIterator it = listD.iterator(0);
        it.next(); it.next();
        it.add(67);
        it = listD.iterator(0);
        while (it.hasNext())
            System.out.println(it.next());

    }
}
