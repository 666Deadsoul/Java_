package JavaCollection.HashMap;

import java.util.HashMap;

// get method used to retrive specific value

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");

        String value = students.get(5);
        System.out.println(value);
    }
}
