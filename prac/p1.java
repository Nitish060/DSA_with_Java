class p1
{
    static int i = 1;
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n)
        {
            return -1;
        }
        if(m==0 && n==0)
        {
            return 0;
        }
        if((m&1)==(n&1))
        {
            i = i+1;
            return posOfRightMostDiffBit(m>>1,n>>1);
        }
        else
        {
            return i;
        }
        
            
    }

    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(185, 195));
    }
}