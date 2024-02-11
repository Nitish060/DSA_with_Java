/* Check if number is odd or even  using bits manipulation */

import java.util.*;
public class BM2 {
    public static void odd_even(int n){
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        odd_even(n);
        sc.close();
    }
}
