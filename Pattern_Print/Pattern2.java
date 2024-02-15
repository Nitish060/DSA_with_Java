import java.util.*;
public class Pattern2 {
    public static void hollow_rectangle(int totrows, int totcolms){
        for(int i = 1; i <= totrows; i++){
            for(int j= 1; j<= totcolms; j++){

                if(i == 1 || i == totrows || j == 1 || j == totcolms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int totrows = sc.nextInt();
        int totcolms = sc.nextInt();
        hollow_rectangle(totrows, totcolms);
        sc.close();
    }
}
