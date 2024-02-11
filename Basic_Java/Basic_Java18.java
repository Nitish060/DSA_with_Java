// ----------- Basic OPPS Concept --------------

import java.util.*;
public class Basic_Java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = sc.nextFloat();
        Area a1 = new Area();
        float r = a1.ar(radius);
        System.out.println("Area of the circle is " + r);
        sc.close();
    }
}

class Square{
    float sq(float n){
        return n*n;
    }
}

class Area{
    float pi = 3.14f;
    float ar(float radius){
    Square s = new Square();
    float a = s.sq(radius);
    return a*pi;
    }
}