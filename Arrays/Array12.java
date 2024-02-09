/* BUY AND SELL STOCKS */

public class Array12 {
    public static int buy_And_Sell_Stock(int prices[])
    {
       int buy_Price = Integer.MAX_VALUE;
       int max_Profit = 0;

       for(int i=0; i<prices.length; i++)
       {
        if(buy_Price < prices[i])
        {
            int profit = prices[i] - buy_Price;
            max_Profit = Math.max(max_Profit, profit);
        }
        else
        {
            buy_Price = prices[i];
        }
       }
       return max_Profit;
    }

    public static void main(String args [])
    {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit during selling of stocks is " + buy_And_Sell_Stock(prices) + " units");
    }
}
