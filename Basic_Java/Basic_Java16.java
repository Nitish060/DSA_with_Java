// --------- Character Print Pattern -----------

import java.util.*;
public class Basic_Java16 {
    public static void main(String args[]) {
        char ch = 'A';
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit less than 7");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+"  ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
