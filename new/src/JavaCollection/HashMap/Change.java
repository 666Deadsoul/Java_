package JavaCollection.HashMap;

import java.util.HashMap;
// replace method is used for changing the value
class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");
        System.out.println("Original HashMap: " + students);

        students.replace(5, "Harry");
        System.out.println("Updated HashMap: " + students);
    }
}