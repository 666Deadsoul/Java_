package JavaCollection.ArrayList;
import java.util.ArrayList;

class Odd {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to numbers
        numbers.add(100);
        numbers.add(201);
        numbers.add(300);
        numbers.add(411);

        for (int i = 0; i <= 3; ++i) {
            // check for odd numbers
            if (numbers.get(i) % 2 != 0) {
                System.out.println(numbers.get(i));
            }
        }
    }
}