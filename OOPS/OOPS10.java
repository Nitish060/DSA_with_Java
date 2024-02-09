public class OOPS10 {
    public static void main(String[] args) {
        Dear d1 = new Dear();
        d1.eat();
        Animal a1 = new Animal();
        a1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}