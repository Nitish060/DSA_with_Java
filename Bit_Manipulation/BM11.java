/* FAST EXPONENTIATION */

import java.util.*;
public class BM11
{
    public static int fast_expo(int a, int n)
    {
        int ans = 1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the exponent :");
        int n = sc.nextInt();
        int ans = fast_expo(a, n);
        System.out.println("The value of " + a + " ^ " + n + " is " + ans);
        sc.close();
    }
}
