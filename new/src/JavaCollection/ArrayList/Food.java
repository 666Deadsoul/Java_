package JavaCollection.ArrayList;
import java.util.ArrayList;
//adding element using index in arraylist
public class Food {
    public static void main(String[] args) {

        ArrayList<String> item = new ArrayList<>();

        item.add("Cappuccino");
        item.add("Chocolates");
        System.out.println("Original ArrayList: " + item);
   
        item.add(0, "Cake");
        item.add(3, "Cookies");

        System.out.println("Updated ArrayList: " + item);
    }
}
