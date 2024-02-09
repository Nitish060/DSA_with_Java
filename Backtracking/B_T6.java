/* Number of ways to reach from (0,0) to (N-1,M-1) in a N*M grid */

public class B_T6 {
    public static int gridw(int i, int j, int n, int m)
    {
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        else if(i == n || j == m)
        {
            return 0;
        }
        int v1 = gridw(i+1, j, n, m);
        int v2 = gridw(i, j+1, n, m);
        return v1+v2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridw(0, 0, n, m));
    }
}
