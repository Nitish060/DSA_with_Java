/* --------- Find if any pair in a sorted & rotated Arraylist has a target sum --------- */

import java.util.ArrayList;

public class Arl4 {
    //Two Pointer Approach  TC: O(n)

    public static boolean pairSum2(ArrayList<Integer> list, int target)
    {
        //Finding breaking or pivot point
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        //Finding the target sum
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp) == target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp) < target)
            {
                lp = (lp+1)%n;
            }
            else
            {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        if(pairSum2(list, 16))
        {
            System.out.println("Pair exist");
        }
        else
        {
            System.out.println("Pair doesn't exist");
        }
    }

}
