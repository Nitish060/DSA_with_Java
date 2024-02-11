// ---------- Use of Continue Keyword ------------

import java.util.*;
public class Basic_Java15 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        do{
            int n = sc.nextInt();
            if(n%10==10){
                continue;
            }
        System.out.println(n);
        sc.close();
        }while(true);
        
    }
}
