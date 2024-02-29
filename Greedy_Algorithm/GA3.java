/* Fractional Knapsack */

/*Given weight and values of Nitems. Put these items ina knapsack of 
 capacity W to get the maximum of total value in the approach */

import java.util.*;

public class GA3 {

    public static int FracKnap(int val[], int weight[], int W)
    {
        //creating 2 dimensional array for storing value/weight
        //0th column=>idx, 1st column=>ratio
        double ratio[][] = new double[val.length][2];
        
        for(int i=0; i<val.length; i++)
        {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //ascending order sort
        Arrays.sort(ratio, Comparator.comparing(o->o[1]));

        int capacity = W;
        int finalVal = 0;
        for(int i=ratio.length-1; i>=0; i--)
        {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx])
            {
                //include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            }
            else
            {
                //include fraction of item
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        int finalVal = FracKnap(val, weight, W);
        System.out.println("Final value is "+finalVal);
    }
}
