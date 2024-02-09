/* POLYMORPHISM--> METHOD OVERLOADING */

public class OOPS9 {
    public static void main(String[] args) {
        Basic_Java17 calc = new Basic_Java17();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));
    }

}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}