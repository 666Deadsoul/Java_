package JavaCollection;
import java.util.ArrayList;
import java.util.Scanner;

//to change the value of array list
 
class Change {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();

        names.set(1,name1);
        System.out.println(names);
        input.close();
    }
}

