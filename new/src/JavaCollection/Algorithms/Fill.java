// Replace ___ with your code
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> l = new LinkedList<>();

        // take input from user
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        String text3 = input.nextLine();
        
        // add text1, text2, text3 to the linkedlist
        l.add(text1);
        l.add(text2);
        l.add(text3);
        
        // fill every element with random
        Collections.fill(l, "random");
        
        // print the list
        System.out.println(l);

        input.close();
    }
}