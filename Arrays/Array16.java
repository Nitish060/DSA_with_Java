/* INBUILT SORT IN JAVA... */
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
 
public class Array16 
{
public static void main(String[] args) {
    

 //int arr[] = new int[] {8,7,5,2,3};
 //Arrays.sort(arr,1,4);
 Integer arr[] = {1,2,3,4,5,6};
 Arrays.sort(arr,0,3,Collections.reverseOrder());
 System.out.println("Elements of sorted array in ascending order");
 for(int i=0; i<arr.length; i++)
 {
     System.out.print(arr[i]+" ");
 }
 System.out.println();

}

    
}
