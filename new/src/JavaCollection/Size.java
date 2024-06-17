package JavaCollection;
import java.util.ArrayList;

//to check size of arraylist

class Size {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

        int size = languages.size();
        System.out.println("Length of ArrayList: " + size);

    }
}