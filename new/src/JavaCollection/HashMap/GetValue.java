package JavaCollection.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

//entrySet() method returns a collection view of the entries(key / value pair).
//entry.getValue() - gets value from the entry
//entry.getKey() - gets key from the entry

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        String value = "Three";

        // print collection view
        System.out.println("Collection view: " + numbers.entrySet());

        // iterate each entry of hashmap
        for (Entry<Integer, String> entry : numbers.entrySet()) {
            
            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                break;
            }
        }
    }
}