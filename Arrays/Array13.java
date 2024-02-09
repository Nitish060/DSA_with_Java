/* BUBBLE SORT PROGRAM.... */

public class Array13 {
 public static void bubble_sort(int arr[])
 {
    for(int turn=0; turn<arr.length; turn++)
    {
        for(int j=0; j<arr.length-1-turn; j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
 }   

 public static void print_arr(int arr[])
 {
    System.out.println("Array after bubble sorting is: ");
    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
 public static void main(String args [])
 {
    int arr[] = {5,4,1,3,2};
    bubble_sort(arr);
    print_arr(arr);
 }
}
