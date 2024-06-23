import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(999);
        numbers.add(212);
        numbers.add(333);
        System.out.println("Unsorted ArrayList: " + numbers);

        // sort the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

    }
}