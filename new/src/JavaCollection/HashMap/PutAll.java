package JavaCollection.HashMap;

import java.util.HashMap;

//creating another hashmap using putAll();

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<>();

        student.put(1, "Taylor");
        student.put(2, "Selena");
        student.put(3, "Sophia");

        System.out.println("student: " + student);

        HashMap<Integer, String> student2 = new HashMap<>();
        
        // add elements of student hashmap to student2 hashmap
        student2.putAll(student);

        System.out.println("student2: " + student2);
    }
}
