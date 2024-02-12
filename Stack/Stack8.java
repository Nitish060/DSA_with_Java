/* Next Greater Element */
/*The next greater element of same element of some element x in array 
is the first great element that is to right of x in same array */

import java.util.*;

public class Stack8 {

    //Function for next greater element
    public static void nextGreater(int arr[], int nGr[])
    {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nGr[i] = -1;
            }
            else
            {
                nGr[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nGr[] = new int[arr.length];

        nextGreater(arr,nGr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Next greater element for "+arr[i]+" in the array is "+nGr[i]);
        }
    }
}
