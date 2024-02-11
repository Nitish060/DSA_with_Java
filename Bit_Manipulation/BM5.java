/* CLEAR Ith BIT ==> means changing that particular bit to 0 */
import java.util.*;

public class BM5 {
    public static int clear_ith_bit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber ");
        int n = sc.nextInt();
        System.out.println("Enter the position of digit you want to clear ");
        int i = sc.nextInt();
        System.out.println("The new number after clearing " + i + "th bit");
        int a = clear_ith_bit(n, i);
        System.out.println(a);
        sc.close();
    }
}
