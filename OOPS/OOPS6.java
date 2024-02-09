/* INHERITANCE --> SINGLE LEVEL INHERITANCE */

public class OOPS6 {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        tuna.breathe();
        tuna.swims();
    }
}

//base class
class Animal{
    String color;

    void eat()
    {
        System.out.println("eats");
    }

    void breathe()
    {
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swism in water");
    }
}

