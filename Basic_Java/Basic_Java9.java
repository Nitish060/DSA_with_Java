// ---------- Income Tax Calculation Program -----------

import java.util.*;
public class Basic_Java9 {
    public static void main(String[] args) {
        int income, tax;
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);
        sc.close();
    }
}
