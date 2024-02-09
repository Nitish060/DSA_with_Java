/* UPDATE Ith BIT */

import java.util.*;
public class BM6 {
    public static int clear_ith_bit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int update_ith_bit(int n, int i, int new_bit){
        n = clear_ith_bit(n,i);
        int bitMask = new_bit<<i;
        return n|bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber ");
        int n = sc.nextInt();
        System.out.println("Enter the position of digit you want to update ");
        int i = sc.nextInt();
        System.out.println("Enter the new bit you want to update ");
        int new_bit = sc.nextInt(); // only 0 and 1
        System.out.println("The new number after updating " + i + "th bit");
        int a = update_ith_bit(n, i, new_bit);
        System.out.println(a);
    }
}
