package JavaCollection.HashMap;
import java.util.HashMap;

//remove method is used to remove the element
class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");
        System.out.println("Original HashMap: " + students);

        students.remove(5);
        System.out.println("Updated HashMap: " + students);
    }
}
