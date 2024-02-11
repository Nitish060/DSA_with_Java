// ------------ Decimal to Binary Conversion ------------

import java.util.Scanner;
public class Basic_Java12 {
    public static void decTobin(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int rem = decNum%2;
            binNum = binNum + (rem*(int)Math.pow(10,pow));

            pow++;
            decNum = decNum/2;
        }
        System.out.println(binNum);
    }

    public static void main(String args []){
        System.out.println("Enter the decimal number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Converted number from decimal to binary is ");
        decTobin(n);
        sc.close();
    }
}


