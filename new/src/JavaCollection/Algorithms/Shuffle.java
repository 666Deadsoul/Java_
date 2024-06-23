import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // Create an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("ArrayList: " + numbers);

        // shuffle ArrayList
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
    }
}