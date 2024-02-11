/* Reverse a stack */

import java.util.*;

public class Stack6 {

    //function for pushing data at bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //function for reversal of stack
    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    //print function for stack
    public static void print(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        System.out.println("Stack after reversal ");
        print(s);
    }
}
