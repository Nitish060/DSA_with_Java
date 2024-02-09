/* MATRIX PROGRAM... */

import java.util.*;
public class Array18 {

    public static boolean search(int matrix[][], int key)
    {
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println(key +" element found at " + i +"," + j + " position");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String args [])
    {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length, key;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter the elements of matrix ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix elemennts are ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       /* System.out.println("Enter the key you want to search");
        key = sc.nextInt();
        search(matrix, key);*/
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest element is " + largest);
        System.out.println("Smallest element is " + smallest);
    }
}
