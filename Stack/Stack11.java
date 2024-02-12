/*Max area in Histogram */
/*Given array of integer heights representing the histograms bar height where the width of each bar is 1.
 * Return the area of the largest rectangle int the histogram
 */

 import java.util.*;

public class Stack11 {
    //function for max area in hitogram
    public static void maxArea(int arr[])
    {
        int nsr[] = new int[arr.length]; //nsr - next smallest right
        int nsl[] = new int[arr.length]; //nsl - next smallest left

        //Next Smallest Right part calaculation
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i] = arr.length;
            }
            else
            {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smallest Left part calaculation
        s = new Stack<>(); //pointing new memory
        for(int i=0; i<arr.length; i++)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i] = -1;
            }
            else
            {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //Current Area = width-j-i-1 = nsr[i]-nsl[i]-1
        int maxArea = 0;
        for(int i=0; i<arr.length; i++)
        {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea  = Math.max(maxArea, currArea);
        }
        System.out.println("Max Area of Histogram is "+maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
