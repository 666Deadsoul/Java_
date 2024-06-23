import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // search element 300
        int position = Collections.binarySearch(numbers, 300);
        System.out.println("Position of 300 is " + position);
    }
}