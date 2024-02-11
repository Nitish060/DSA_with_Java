/* CHECK IF A STRING IS A PALINDROME */

import java.util.*;
public class String3 {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //Not Palindrome
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your string");
        String str =  sc.nextLine();
        boolean b1 = isPalindrome(str);
        if(b1==true){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Given string is not palindrome");
        }
        sc.close();
    }
}
