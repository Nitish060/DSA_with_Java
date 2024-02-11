/* CLEAR RANGE OF BITS */

import java.util.*;
public class BM8 {
    public static int clear_Ir_bits(int n, int i, int j)
    {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a/b;
        return n&bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the stating range :");
        int i = sc.nextInt();
        System.out.println("Enter the ending range :");
        int j = sc.nextInt();
        int nm = clear_Ir_bits(n, i, j);
        System.out.println("Number after clearing range from "+ i + " to "+ j + " is "+ nm);
        sc.close();
    }
}
