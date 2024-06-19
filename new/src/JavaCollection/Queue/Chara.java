// Replace ___ with your code
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList of Character type
        LinkedList<Character> c = new LinkedList<>();

        // use add() to insert A to alphabets
        c.add('A');

        // take two input from the user
        Scanner input = new Scanner(System.in);
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);
        
        // use addFirst() to insert char1 at the beginning of alphabets
        c.addFirst(char1);

        // Use addLast() to insert char2 at the end of alphabets
        c.addLast(char2);

        // print alphabets
        System.out.println(c);
        
        input.close();
    }
}