/* CLEAR LAST I BITS */

import java.util.*;;
public class BM7 {
   public static int clear_I_bits(int n, int i)
   {
    int bitMask = (~0)<<i;
    return n&bitMask;
   }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    System.out.print("Enter the last range for clearing ");
    int i = sc.nextInt();
    int a = clear_I_bits(n, i);
    System.out.print("Number after clearing last "+ i + " bits is : "+ a);

   }
    
    }

