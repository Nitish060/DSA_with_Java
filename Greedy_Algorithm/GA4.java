/* Minimum Absolute Difference Pairs */
/* Given two arrays A and B of equal length n. Pair each element of array A to an element
 * in array B, such that sum S of absolute difference of all the pairs is minimum
 */

import java.util.*;

public class GA4 {
    public static int MinAbsDiff(int A[], int B[])
    {
        //sort both the arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++)
        {
            minDiff += Math.abs(A[i]-B[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] ={2,3,6,5};

        int minDiff = MinAbsDiff(A, B);
        System.out.println("Minimum Absolute Difference Sum = "+minDiff);
    }
}
