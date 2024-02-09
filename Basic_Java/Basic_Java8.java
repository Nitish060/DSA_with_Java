// ------------ Finding Even or Odd Number -----------

import java.util.*;
public class Basic_Java8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println( "EVEN NUMBER");
        }
        else{
            System.out.println( "ODD NUMBER");
        }

    }
    
}
