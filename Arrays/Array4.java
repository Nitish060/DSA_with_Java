/* LARGEST NUMBER IN ARRAY */

import java.util.*;

public class Array4 {
    public static int get_largest(int number[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int number[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Largest value of the array is " + get_largest(number));
    }
}
