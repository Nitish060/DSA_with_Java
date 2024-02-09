/* SPIRAL MATRIX */

public class Array19 {
    public static void print_Spiral(int matix[][])
    {
        int start_Row = 0, start_Col = 0, end_Row = matix.length-1, end_Col = matix[0].length-1;
        while(start_Row <= end_Row && start_Col <= end_Col)
        {
            //top
            for(int j = start_Col; j<=end_Col; j++)
            {
                System.out.print(matix[start_Row][j] + " ");
            }

            //right
            for(int i = start_Row+1; i<=end_Row; i++)
            {
                System.out.print(matix[i][end_Col] + " ");
            }

            //bottom
            for(int j = end_Col-1; j>=start_Col; j--)
            {
                if(start_Row == end_Row)
                {
                    break;
                }
                System.out.print(matix[end_Row][j] + " ");
            }

            //left
            for(int i = end_Row-1; i>=start_Row+1; i--)
            {
                if(start_Col == end_Col)
                {
                    break;
                }
                System.out.print(matix[i][start_Col] + " ");
            }
            start_Col++;
        start_Row++;
        end_Col--;
        end_Row--;

        }
        
    }

    public static void main(String[] args) {
        int matix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println("Spiral matrix is: ");
        print_Spiral(matix);
    }
}
