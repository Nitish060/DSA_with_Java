public class OOPS11 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

        Mustang myHare = new Mustang();
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructior is called");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}


class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }

    Horse(){
        System.out.println("Horse constructor is called");
    }

    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{

    Chicken(){
        System.out.println("Chicken constructor is called");
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}