// -------------Binary to Decimal Conversion---------------

import java.util.Scanner;
public class Basic_Java11 {
    public static void binTodec(long  binNum){
        int pow = 0;
        long decNum = 0;
        while(binNum > 0){
            long lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(long)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }

    public static void main(String args []){
        System.out.println("Enter the binary number ");
        Scanner sc = new Scanner(System.in);
       long  n = sc.nextInt();
        System.out.println("Converted number from binary to decimal is ");
        binTodec(n);
        sc.close();
    }
}
