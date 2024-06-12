package OOP.Interface;

interface Animal {
 
    abstract public void play(); 
    abstract public void makeSound();
}
 
class Dog implements Animal {
    public void play() {
        System.out.println("I play ball fetch");
    }
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
 
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.play();
        dog.makeSound();
    }
}