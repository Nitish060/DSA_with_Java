// ------------- Checking Number is Prime or not -------------

import java.util.*;
public class Basic_Java3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(n + " is Prime");
        }
        else{
            boolean isPrime = true;
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0 ){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is Prime");
            }
            else{
                System.out.println(n + " is not Prime");
            }
        }
    }
}
