/* REMOVE DUPLICATES IN A STRING */

import java.util.*;
public class Recursion11 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string ");
     String str = sc.next();
     remove_Duplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }

    public static void remove_Duplicates(String str, int idx, StringBuilder newstr, boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println("String "+str +" without duplicate is "+newstr);
            return;
        }

        char curr_Char = str.charAt(idx);
        if(map[curr_Char-'a'] == true)
        {
            //duplicate
            remove_Duplicates(str, idx+1, newstr, map);
        }

        else
        {
            map[curr_Char-'a'] = true;
            remove_Duplicates(str, idx+1, newstr.append(curr_Char), map);
        }
    }
}
