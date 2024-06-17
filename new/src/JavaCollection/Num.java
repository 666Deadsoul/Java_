package JavaCollection;

import java.util.*;
import java.util.Scanner;

//Double type, accessing using get and index in loop
class Num {
    public static void main(String[] args) {
        ArrayList<Double> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        // add elements to numbers
        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);

        for (int i = 0; i <= 3; ++i) {
            System.out.println(num.get(i));

        }
        
        input.close();
    }
}
