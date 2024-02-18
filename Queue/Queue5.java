/* Queue using 2 Stacks */

import java.util.Stack;

public class Queue5 {
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty()
        {
            return s1.isEmpty();
        }

        //function for adding element ---- Time Complexity = O(n)
        public void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty())
            {
                s1.push(s2.pop());  
            }
        }

        //function for removing element ---- Time Complexity = O(1)
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        //function for peek ---- Time Complexity = O(1)
        public int peek()
        {
            if (isEmpty())
            {
                System.out.println("Queue iS Empty");
                return -1;   
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
