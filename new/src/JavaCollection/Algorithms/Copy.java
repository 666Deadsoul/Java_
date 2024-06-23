import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> src = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        src.add(num1);
        src.add(num2);
        
        ArrayList<Integer> dest = new ArrayList<>();

        dest.add(22);
        dest.add(33);

        // copy src to dest 
        Collections.copy(dest, src);
        System.out.println(dest);

        input.close();
    }
}