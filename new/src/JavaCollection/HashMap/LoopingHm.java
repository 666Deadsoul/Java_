package JavaCollection.HashMap;

import java.util.HashMap;
 
class Main {
    public static void main(String[] args) {
 
        // create a HashMap
        HashMap<Integer, String> students = new HashMap<>();
 
        // add elements
        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");
 
        // students.keySet() returns key of Hashmap
        for (Integer key : students.keySet()) {
 
            // students.get(key) gets the value of key using get()
            System.out.println(key + ": " + students.get(key));
        }
 
    }
}
