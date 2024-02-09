// ----------------- Finding Prime Numbers in Range ------------------

import java.util.*;
public class Basic_Java4 {
    public static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primes_in_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = sc.nextInt();
        primes_in_range(n);
    }
}