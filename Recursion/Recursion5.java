/* CHECK IF ARRAY IS SORTED  */

import java.util.*;
public class Recursion5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean b = is_sorted(arr, 0);
        
        if(b==true)
        {
            System.out.println("Array is sorted ");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean is_sorted(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }

        if(arr[i]>arr[i+1])
        {
            return false;
        }

        return is_sorted(arr, i+1);
    }
}
