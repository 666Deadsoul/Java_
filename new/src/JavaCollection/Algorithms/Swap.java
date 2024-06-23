// Replace ___ with your code
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> i = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // add elements to numberList
        i.add(num1);
        i.add(num2);
        i.add(num3);

        // swap num1 and num3
        Collections.swap(i, 0, 2);
        
        // print the arraylist
        System.out.println(i);

        input.close();
    }
}