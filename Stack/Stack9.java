/* Valid Parenthesis */
/*Given a string S containg characters '(', ')', '{', '}', '[', ']' determine if the input string is valid or not */
/*An input string valid is valid if
 *  ->1 Open brackets must be closed by the same type of brackets
 *  ->2 Open brackets must be closed in the correct order
 *  ->3 Every close bracket has a corresponding open bracket of the same type
 */

import java.util.*;

public class Stack9 {
    // function for valid parenthesis
    public static boolean isValid(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '[')
            {
                //opening
                s.push(ch);
            }
            else
            {
                //closing
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']'))
                {
                    s.pop();
                }
                else
                {
                    return false;
                }
            }
        }
         if(s.isEmpty())
         {
            return true;
         }
         else
         {
            return false;
         }  
    }

    public static void main(String[] args) {
        String str = "(({}[]))";
        System.out.println("String "+str+" is valid: "+isValid(str));
    }
}
