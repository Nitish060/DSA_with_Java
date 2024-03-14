/* Chocola Problem
 * Given a bar of chocolate composed of m*n pieces. One should break the chocolate into single square 
 * such that cost of breaking the whole chocolate should be minimal
 */

import java.util.*;

public class GA8 {
    public static void main(String[] args) {
       // int n=4; horizontal
       // int m=6; vertical
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost=0;

        while(h<costHor.length && v<costVer.length)
        {
            if(costVer[v]<=costHor[h])
            {
                //horizontal cost
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }
            else{
                //vertical cost
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length)
        {
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length)
        {
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost is "+cost);
    }
}
