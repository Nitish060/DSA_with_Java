// ----------- Sum of Numbers upto N -----------

import java.util.*;
public class Basic_Java10 {
    public static void main(String [] args){
        int n , count = 1, sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         n = sc.nextInt();
        while(count<=n){
          // System.out.print(count+" ");
          sum += count;
            count++;
        }
        System.out.println("Sum upto " + n + " is " +sum);
        sc.close();
    }
}
