/* Stack using deque */

import java.util.*;

public class Queue11 {
    static class Stack
    {
        Deque<Integer> deque = new LinkedList<>();
        //push function
        public void push(int data)
        {
            deque.addLast(data);
        }
        //pop function
        public int pop()
        {
            return deque.removeLast();
        }
        //peek function
        public int peek()
        {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek "+s.peek());
        System.out.println(s.pop()+" "+s.pop()+" "+s.pop());
    }
}
