/* FIBONACCI TERMS */

import java.util.*;
public class Recursion4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = fibonacci(n);
        System.out.println("Fibonacci term is "+r);
    }

    public static int fibonacci(int n)
    {
        if(n==0 || n == 1)
        {
            return n;
        }

        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}
/* 0 1 1 2 3 5 8 */