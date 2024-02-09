/* ---------- Sudoko Solver --------- */

public class B_T7 {
    public static boolean isSafe(int sudoko[][], int row, int col, int digit)
    {
        //row
        for(int i=0; i<=8; i++)
        {
            if(sudoko[i][col]==digit)
            {
                return false;
            }
        }

        //column
        for(int j=0; j<=8; j++)
        {
            if(sudoko[row][j]==digit)
            {
                return false;
            }
        }

        //grid
        int sr= (row/3)*3;
        int sc= (col/3)*3;
        //3*3
        for(int i=sr; i<sr+3; i++)
        {
            for(int j=sc; j<sc+3; j++)
            {
                if(sudoko[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokoSolver(int sudoko[][], int row, int col)
    {
        //base-case
        if(row==9)
        {
            return true;
        }

        //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1==9)
        {
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoko[row][col]!=0)
        {
            return sudokoSolver(sudoko, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++)
        {
            if ((isSafe(sudoko, row, col, digit)))
            {
                sudoko[row][col]=digit;
                if(sudokoSolver(sudoko, nextRow, nextCol))
                {
                    return true;//solution exist
                }
                sudoko[row][col]=0;   
            }
        }
        return false;
    }

    public static void printsudoku(int sudoko[][])
    {
        System.out.println("_____________________");
        System.out.println("|                   |");
        for(int i=0;i<9;i++)
        {
            System.out.print("| ");
            for(int j=0;j<9;j++)
            {
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("|___________________|");
    }

    public static void main(String[] args) {
        int sudoko[][] ={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };
        if(sudokoSolver(sudoko, 0, 0))
        {
            System.out.println(("Solution Exist"));
            printsudoku(sudoko);
        }
        else
        {
            System.out.println(("Solution Doesn't Exist"));
        }
    }
}
