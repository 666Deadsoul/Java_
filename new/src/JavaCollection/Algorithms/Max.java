import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(999);
        numbers.add(0);
        System.out.println("ArrayList: " + numbers);

        // find the minimum element
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // find the maximum element
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}