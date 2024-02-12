/* FACTORIAL USING RECURSION */

import java.util.*;
public class Recursion2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = factorial(n);
        System.out.println("Factorial of number "+n+" is "+r);
        sc.close();
    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn = n*factorial(n-1);
        return fn;
    }
}
