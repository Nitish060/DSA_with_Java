/* INHERITANCE --> MULTILEVEL INHERITANCE */

public class OOPS7 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//exetnd class
class Mammal extends Animal{
    int legs;
}

//extend class
class Dog extends Mammal{
    String breed;
}