package JavaCollection.ArrayList;
import java.util.*;
import java.util.Scanner;

//to remove the element in array list

public class Remove {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        
        names.remove(index);
        System.out.println(names);
        input.close();
    }
}