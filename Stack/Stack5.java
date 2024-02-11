/* Reverse a string using a stack */

import java.util.*;

public class Stack5 {
    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }    

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        System.out.println("String "+str+" after reversal is "+reverseString(str));
        sc.close();
    }
}
