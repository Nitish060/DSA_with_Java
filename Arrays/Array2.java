/* PASSING ARRAYS AS ARGUEMENT */

import java.util.*;
public class Array2 {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
          marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args []){
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks before updation: ");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Marks after updation");
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
