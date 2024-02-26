/* Activity Selection Problem */
/* You are given n activities with their start and end times. Select maximum no. of activities that can be performed by a single person
 * assuming that a person can only work on a single activity at a time.*/

 /* Activities are unsorted according to end time */

import java.util.*;

public class GA2 {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};//start time
        int end[]   = {6,2,4,7,9,9};//end time-->sunorted

        //sorting based on end time
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++)
        {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
        //end time basis sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++)
        {
            if(activities[i][1]>=lastEnd)
            {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum Activities: "+maxAct);
        System.out.println("Activities are: ");
        for(int i=0; i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
