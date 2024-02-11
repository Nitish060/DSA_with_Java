/* Check if a number is power of 2 or not */

import java.util.*;
public class BM9 {
    
    public static boolean is_Power_ofTwo(int n)
    {
        return (n & (n-1))==0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter the number :"));
        int n = sc.nextInt();
        boolean b = is_Power_ofTwo(n);
        if(b==true)
        {
            System.out.println("Yes, number is a power of 2");
        }
        else
        {
            System.out.println("No, number is not a power of 2");
        }
        sc.close();
    }
}
