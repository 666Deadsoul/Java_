import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        LinkedList<Character> c = new LinkedList<>();

        c.add('A');

        Scanner input = new Scanner(System.in);
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);
        
        c.addFirst(char1);

        c.addLast(char2);

        System.out.println(c);
        
        input.close();
    }
}