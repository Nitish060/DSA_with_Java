import java.util.*;
public class Pattern4 {
    public static void inverted_half_pyramid_withNumbers(int n){
      for(int i = 1; i<=n; i++){
        for(int j= 1; j<=n-i+1; j++){

            System.out.print(j+" ");
        }
        System.out.println();
      }
    }

    public static void main(String args []){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your limit: ");
       int n = sc.nextInt();
       inverted_half_pyramid_withNumbers(n);
       sc.close();
    }
}
