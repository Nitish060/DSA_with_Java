// -------------- Reversing a Given Number --------------

import java.util.*;
public class Basic_Java5 {
    public static void main(String [] args){
    int n, rev = 0, temp, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    n = sc.nextInt();
    temp = n;
    while(n>0){
    i = n%10;
    rev = rev*10 + i;
    n = n/10;
    }
        System.out.println("Reversed number is " +rev);
    
     
    }
}
