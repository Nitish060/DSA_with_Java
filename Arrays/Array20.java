/* DIAGONAL SUM IN MATRIX... */
 
public class Array20 {
    /*--> BRUTE FORCE METHOD */

    public static int diagonal_Sum1(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    
    /* OPTIMIZED METHOD  */

    public static int diagonal_Sum2(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        System.out.println("Sum of diagonal elements is: ");
        //int sum = diagonal_Sum1(matrix);
        int sum = diagonal_Sum2(matrix);
        System.out.println(sum);
    }

}
