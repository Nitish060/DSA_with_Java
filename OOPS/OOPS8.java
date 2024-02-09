/* HIERARCHIAL INHERITANCE */

public class OOPS8 { 
    public static void main(String[] args) {
        Bird spparow = new Bird();
        Fish tauna = new Fish();
        spparow.breathe();
        spparow.flies();
        tauna.eat();
        tauna.swims();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("brathes");
    }
}

class Bird extends Animal{
    void flies(){
        System.out.println("flies");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("swims");
    }
}
