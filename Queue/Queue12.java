/* Queue using Deque */

import java.util.*;

public class Queue12 {
    static class Queue
    {
        Deque<Integer> deque = new LinkedList<>();
        //add function
        public void add(int data)
        {
            deque.addLast(data);
        }
        //remove function
        public int remove()
        {
            return deque.removeFirst();
        }
        //peek function
        public int peek()
        {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Peek "+q.peek());
        System.out.println(q.remove()+" "+q.remove()+" "+q.remove());
    }
}
