/* Get ith bit */

import java.util.Scanner;
public class BM3 {

    public static int get_ith_bit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber ");
        int n = sc.nextInt();
        System.out.println("Enter the position of digit you want to get ");
        int i = sc.nextInt();
        System.out.println("The digit at position " + i + " is ");
        int a = get_ith_bit(n, i);
        System.out.println(a);
        sc.close();
    }
}
