/*Duplicate Paraenthesis */
/*Given a balanced expression find if it contains duplicate parenthesis or not.
 * A set of parenthesis are duplicate if the same subexpression is surrounded by multiple parenthesis 
 * Example: (((a+(b)))+(c+d)) --> duplicate: true
 *          ((a+b)+(c+d))     --> duplicate: false
 */

 import java.util.*;

public class Stack10 {
    //function for Duplicate parenthesis
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            //closing
            if(ch==')')
            {
                int count = 0;
                while(s.peek()!='(')
                {
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;//duplicate
                }
                else
                {
                    s.pop();//opening pair
                }
            }
            else
            {
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b)))+(c+d))";
        System.out.println("String "+str+" is duplicate: "+isDuplicate(str));
    }
}
