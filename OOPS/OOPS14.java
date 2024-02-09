/* SUPER KEYWORD */

public class OOPS14 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal costructor is called");
    }

    void eats(){
        System.out.println("eats");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        super.eats();
        System.out.println("Horse constructor is called");
    }
}