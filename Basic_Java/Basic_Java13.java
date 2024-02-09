// ------------Finding Binomial Coefficient----------------

import java.util.*;
public class Basic_Java13 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);

        int bc = a / (b * c);

        return bc;
    }

    public static void main(String args[]) {
        System.out.println("Enter the required numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial coefficient is " + binCoeff(n, r));
    }
}
