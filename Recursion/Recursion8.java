/* TO FIND THE LAST OCCURENCE OF AN ELEMENT IN ARRAY */

public class Recursion8 {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i = first_occur(arr, 5, 0);
        System.out.println("Last occurence of key is at "+last_Occurence(arr, 5, i));
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


    public static int last_Occurence(int arr[], int key, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }

        int isFound = last_Occurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key)
        {
            return i;
        }
        return isFound;
    }
}
