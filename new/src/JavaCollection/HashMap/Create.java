package JavaCollection.HashMap;

import java.util.HashMap;

// put() method to add elements
class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        
        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");

        System.out.println(students);
    }
}