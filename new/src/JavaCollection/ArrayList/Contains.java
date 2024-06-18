package JavaCollection.ArrayList;
import java.util.ArrayList;

//to check if the value is in array list or not

class Contains {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("C++");
        courses.add("DSA");

        System.out.println("Is DSA present in courses arraylist: ");
        if (courses.contains("DSA")) {
            System.out.println("DSA is available");
        }

        else {
            System.out.println("DSA is not available");
        }
    }
}
