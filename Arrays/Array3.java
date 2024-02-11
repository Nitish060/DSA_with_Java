/* LINEAR SEARCH PROGRAM FOR ARRAYS... */
import java.util.*;
public class Array3 {

    public static int linear_search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {

            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
       int number[] = {4,6,3,8,10,5,1,9,2};
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your key: ");
       int key = sc.nextInt();
       int index = linear_search(number, key);
       if(index == -1){
        System.out.println("Key not found.");
       }
       else{
        System.out.println("Key is at " + index);
       }
       sc.close();
    }
}
