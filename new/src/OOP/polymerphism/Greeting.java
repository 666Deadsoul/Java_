package OOP.polymerphism;
import java.util.Scanner;

class Greeting {

    public void greet(String name){
        System.out.println("Hello " + name);
    }
}

class LocalGreeting extends Greeting {
    public void greet(String name) {
        System.out.println("Namaste "+ name);
    }
}

class Main {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Greeting g= new Greeting();
        LocalGreeting lg = new LocalGreeting();
        g.greet(name);
        lg.greet(name);
        input.close();
    }
}