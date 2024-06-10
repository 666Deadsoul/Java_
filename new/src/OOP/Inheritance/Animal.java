package OOP.Inheritance;

//parent class
public class Animal {
    void eat() {
        System.out.println("I can eat.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark.");
    }
}
class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
    }
}
