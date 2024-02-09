public class Recursion12 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Friend pairing ways of "+n+ " friends is "+ friends_Pairing(n));
    }

    public static int friends_Pairing(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        //choice
        //single
        int fnm1 = friends_Pairing(n-1);
        //pair
        int fnm2 = friends_Pairing(n-2);
        int pair_ways = (n-1)*fnm2;

        //totalways
        int totways = fnm1 + pair_ways;
        return totways;
    }
}
