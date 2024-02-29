/*Indian Coins */
/* We are given an infinite supply of denominations [1,2,5,10,20,50,100,200,500,2000] 
 * Find minimum number of coins/notes to make change for value V
*/

import java.util.*;

public class GA6 {
    public static void MinCoins(Integer coins[], int amount)
    {
        //sort coins
        Arrays.sort(coins,Comparator.reverseOrder());
        int countCoins = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++)
        {
            if(coins[i]<=amount)
            {
                while(coins[i]<=amount)
                {
                    countCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        
        System.out.println("Total Minimum coin used = "+countCoins);

        for(int i=0; i<ans.size(); i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        int amount =590;

        MinCoins(coins, amount);
    }
}
