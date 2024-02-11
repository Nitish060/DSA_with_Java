// ------------- Checking voting eligibility program -------------

import java.util.*;
public class Basic_Java7 {
public static void main(String [] args)
{
    int age;
    System.out.println("Enter you age");
    Scanner sc = new Scanner( System.in);
    age = sc.nextInt();
    if(age>=18)
    {
        System.out.println(  "adult: drive,vote");
    }
    else if(age>= 13 && age<= 18)
    {
        System.out.println("Teenager");   
    }
    else 
    {
        System.out.println("Not Adult ");  
    }
    sc.close();
}
}
