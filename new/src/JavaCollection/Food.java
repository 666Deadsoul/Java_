package JavaCollection;
import java.util.ArrayList;

public class Food {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<String> item = new ArrayList<>();

        // add elements in ArrayList
        item.add("Cappuccino");
        item.add("Chocolates");

        // print elements of ArrayList
        System.out.println("Original ArrayList: " + item);

        // add element at the first position        
        item.add(0, "Cake");

        // add element at the fourth position
        item.add(3, "Cookies");

        System.out.println("Updated ArrayList: " + item);
    }
}
