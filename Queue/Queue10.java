/* Double Ended Queue(Deque) */

import java.util.*;

public class Queue10 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("Element at first "+deque.getFirst());
        System.out.println("Element at last "+deque.getLast());
    }
}
