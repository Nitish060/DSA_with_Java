/* Implementation using Linkedlist */

public class Stack2 {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack
    {
        static Node top = null;

        static boolean isEmpty()
        {
            return top==null;
        }

        //push function
        public static void push(int data)
        {
            Node newNode = new Node(data);
                if(isEmpty())
                {
                    top = newNode;
                    return;
                }
            newNode.next = top;
            top = newNode;
        }

        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while (!Stack.isEmpty()) {
            System.out.print(Stack.peek()+" ");
            Stack.pop();
        }
    }
}
