/* SEARCH IN SORTED MATRIX... */

import java.util.*;
public class Array21{
    
    public static boolean Staircase_search(int matrix[][], int key){
      int row = 0, col = matrix[0].length-1;

      while(row<matrix.length && col>0){
        if(matrix[row][col] == key){
            System.out.println("Element is found at " + row + "," + col);
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
      }
      System.out.println("Element not found ");
      return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search ");
        int key = sc.nextInt();
        Staircase_search(matrix, key);
        sc.close();
    }
}