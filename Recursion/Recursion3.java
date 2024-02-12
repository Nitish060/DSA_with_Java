/* SUM OF FIRST N NATURAL NUMBERRS */

import java.util.*;
public class Recursion3 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = calc_sum(n);
        System.out.println("Sum of first "+n+" number is "+r);
        sc.close();
    }

    public static int calc_sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int snm1 = calc_sum(n-1);
        int sn = n+snm1;
        return sn;
    }
}
