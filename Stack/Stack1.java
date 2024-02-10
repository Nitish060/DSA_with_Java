/* Implementation of Stacks using Arraylist */

import java.util.ArrayList;

public class Stack1 {
    static class Stack
    {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }

        //push function for stack
        public static void push(int data)
        {
            list.add(data);
        }

        //pop function for stack
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek function for stack
        public static int peek()
        {
            if(isEmpty())
                return -1;
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        
        //Accessing static methods directly by class
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
