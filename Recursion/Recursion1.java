/* PRINT NUMBERS FROM N TO 1 */

import java.util.*;
public class Recursion1 {
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Numbers are");
        printDec(n);
        sc.close();
    }
}
