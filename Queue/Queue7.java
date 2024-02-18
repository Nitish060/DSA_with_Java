/* First non-repeating letter in a stream of characters */

import java.util.*;

public class Queue7 {

    //function for first non-repeating character
    public static void print_Non_repeating(String str)
    {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1)
            {
                q.remove();
            }

            if(q.isEmpty())
            {
                System.out.print(-1+" ");
            }
            else
            {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        print_Non_repeating(str);
    }
}
