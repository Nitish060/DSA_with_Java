/* Count set bits in a number  */
/* Number of bits = (log^n_2)+1 */

import java.util.*;
public class BM10 {
    
    public static int count_setBits(int n)
    {
        int count = 0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
           n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int c = count_setBits(n);
        System.out.println("Number of set bits in number " + n + " is " + c);
    }
}
