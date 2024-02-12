/* CHECK FIRST OCCURENCE OF ELEMENT */

public class Recursion6 {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(first_occur(arr, 5, 0));
    }

    public static int first_occur(int arr[], int key, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }

        if(arr[i]==key)
        {
            return i;
        }

        return first_occur(arr, key, i+1);
    }
}
