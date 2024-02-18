/* Stack using 2 Queues */

import java.util.*;

public class Queue6 {
    static class Stack
    {
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        public boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }

        //push function
        public void push(int data)
        {
            if(!q1.isEmpty())
            {
                q1.add(data);
            }
            else
            {
                q2.add(data);
            }
        }

        //pop function
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            //case-1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top = q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }
            //case-2
            else
            {
                while(!q2.isEmpty())
                {
                    top = q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            //case-1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            //case-2
            else
            {
                while(!q2.isEmpty())
                {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
