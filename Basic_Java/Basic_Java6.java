// -------------- Using getter and setter in JAVA ---------------

import java.util.Scanner;
public class Basic_Java6 {
    int cid ;
   void setter() 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the coolege id ");
    cid = sc.nextInt();
   }
   void getter()
   {
    System.out.println(cid);
   }
     public static void main(String[] args) {
    Basic_Java6 s1 = new Basic_Java6();
    Basic_Java6 s2 = new Basic_Java6();
    s1.setter();
    s2.setter();
    s1.getter();
    s2.getter();
   }
}
