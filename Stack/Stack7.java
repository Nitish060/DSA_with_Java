/*Stock Span Problem */
/*Span -> Maximum number of days for which price <= today's price */

import java.util.*;

public class Stack7 {
    //fuction for finding stock span
    public static void stockSpan(int stocks[], int span[])
    {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++)
        {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i] = i+1;
            }
            else
            {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        System.out.println("Span is ");
        for(int i=0; i<span.length; i++)
        {
            System.out.print(span[i]+" ");
        }
    }
}
