/* ----------- Pair Sum-1: Find if any pair in a sorted Arraylist has a target sum ---------- */

import java.util.ArrayList;

public class Arl3 {

    // Two pointer approach TC: O(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target)
    {
        int lp=0, rp=list.size()-1;
        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp) == target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp) < target)
                lp++;
            else
                rp--;
        }
        return false;
    }


    //Brute Force   TC: O(n^2)

    // public static boolean pairSum1(ArrayList<Integer> list, int target)
    // {
    //     for(int i=0; i<list.size(); i++)
    //     {
    //         for(int j=i+1; j<list.size(); j++)
    //         {
    //             if(list.get(i)+list.get(j) == target)
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        if(pairSum1(list, 5))
        {
            System.out.println("Pair exist");
        }
        else
        {
            System.out.println("Pair doesn't exist");
        }
    }
}
