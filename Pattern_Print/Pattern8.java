import java.util.*;
public class Pattern8 {
    public static void solid_rohmbus(int n){
        for(int i =1; i <= n; i++){

            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit");
        int n = sc.nextInt();
        solid_rohmbus(n);
    }
}
