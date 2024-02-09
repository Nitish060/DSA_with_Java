/* Container with Most Water */
/* For a given lines 0n x-axis use 2 lines to form a container such that it holds maximum water */

import java.util.ArrayList;

            //Optimized Approach TC:O(n)
public class Arl2 {

    public static int storeWater(ArrayList<Integer> height)
    {
        int max_water = 0;
        int lp=0, rp=height.size()-1;

        while (lp<rp) 
        {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            max_water = Math.max(max_water, currWater);  
            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return max_water;
    } 

               //Brute Force TC: O(n^2)
    // public static int storeWater(ArrayList<Integer> height)
    // {
    //     int max_water = 0;

    //     for(int i=0; i<height.size(); i++)
    //     {
    //         for(int j=i+1; j<height.size(); j++)
    //         {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater = ht*width;
    //             max_water = Math.max(max_water, currWater);
    //         }
    //     }
    //     return max_water;
    // }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum water can be store "+storeWater(height));
    }
}
