package OOP.Inheritance;

public class Pet {
    void sleep() {
        System.out.println("I can Sleep");
    }
}

class Puppy extends Pet {
    void woof() {
        System.out.println("Woof!!");
    }
}

class Kitten extends Pet {
    void meow() {
        System.out.println("Meow!");
    }
}

class Main {
    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.woof();
        p.sleep();

        Kitten k = new Kitten();
        k.meow();
        k.sleep();
    }
}
