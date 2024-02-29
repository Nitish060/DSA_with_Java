/* Maximum Length Chain of Pairs */
/* You are given n pairs of numbers, in every pair the first number is always 
    smaller than the second number. A pair (c,d) can come after pair (a,b) if b<c  */

/*Find the longest chain which can be formed from a given set of pairs*/

import java.util.*;

public class GA5 {

    public static int MaxLenChain(int pairs[][])
    {
        //sorting of pairs
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainlen = 1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++)
        {
            if(pairs[i][0]>chainEnd)
            {
                chainlen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainlen;
    }
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int chainLen = MaxLenChain(pairs);

        System.out.println("Maximum Length of chain = "+chainLen);
    }    
}
