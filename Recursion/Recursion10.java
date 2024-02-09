/* COUNT THE NUMBER OF WAYS OF TILING THE FLOOR OF SIZE 2*N USING 2*1 SIZE TILES */

public class Recursion10 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways of tilling floor of size 2*"+3+" is "+tilling_prblm(n));
    }

    public static int tilling_prblm(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        //vertical choice
        int fnm1 = tilling_prblm(n-1);

        //horizontal
        int fnm2 = tilling_prblm(n-2);

        int toWays = fnm1+fnm2;
        return toWays;
    }
}
