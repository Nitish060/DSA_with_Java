/* TO FIND THE POWER OF A NUMBER  */

public class Recursion9 {
    public static void main(String[] args) {
        System.out.println("Value of 2 to the power 9 is "+power(2, 9));
    }

    // BRUTE FORCE CODE FOR CALCULATING POWER

    /*public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*power(x, n-1);
    }*/

    // OPTIMIZED CODE FOR CALCULATING POWER

    public static int power(int a, int n)
    {
        if(n==0)
        {
            return 1;
        }

        int half_power = power(a, n/2);
        int half_power_sq = half_power*half_power;

        // n is odd
        if(n%2 != 0)
        {
            return a*half_power_sq;
        }

        return half_power_sq;
    }
}
