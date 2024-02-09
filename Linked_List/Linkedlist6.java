/* Java Collections Framework for Linked List */

import java.util.LinkedList;
public class Linkedlist6 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
