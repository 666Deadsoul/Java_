package arrays;
import java.util.*;
public class Percentage {
   
    public static void main(String[] args) {

        // create a double array
        double [] marks = new double[8];

        // get input values for obtained marks
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < marks.length; ++i) {
           marks[i]= input.nextDouble();

        }

        // create a variable to store obtainedMarks
        double obtainedMarks = 0.0;
        
        // find the sum of obtained marks using a loop
        for (int i = 0; i < marks.length; ++i) {
            obtainedMarks += marks[i];
        }

        // create totalMarks variable
        int totalMarks = 800;
        
        // find the percentage and print it
        double percentage = (obtainedMarks*100) / totalMarks;
        System.out.println(percentage);

        input.close();
    }
}
