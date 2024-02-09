// ----------- Basic Calculator Program -----------

import java.util.*;
public class Basic_Java17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char oprator = sc.next().charAt(0);
    
        switch(oprator){
            case '+' : System.out.println(a+b);
                 break;     
            case '-' : System.out.println(a-b);     
                 break;  
            case '*' : System.out.println(a*b); 
                 break;        
            case '/' : System.out.println(a/b);   
                 break;    
            case '%' : System.out.println(a%b);
                 break;       
            default : System.out.println("NOT APPPLICABLE");
        
        }

    }
}
