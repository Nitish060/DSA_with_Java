/* ---------- Backtracking Arrays ---------- */

public class B_T1 {
    public static void changeArray(int arr[], int i, int val)
    {
        //Base Case
        if(i==arr.length)
        {
            printArray(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1); // function calling step
        arr[i] -= 2;                  //backtracking step
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        System.out.println("Array after backtracking");
        printArray(arr);
    }

}
