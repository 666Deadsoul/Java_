package arrays;
import java.util.Scanner;

public class SD {

    double calculateSD(double data[]) {
        double sum = 0.0;

        // find the sum of all the array elements
        for (int i = 0; i < data.length; ++i) {
            sum += data[i];
        }

        // compute the mean
        double mean = sum / data.length;
        
        double result = 0.0;
        for (int i = 0; i < data.length; ++i) {

            // difference of each array value and mean
            double difference = data[i] - mean;

            // square of each difference
            double squaredDifference = Math.pow(difference,2);

            // add all the square difference 
            result += squaredDifference;
        }

        // result divide by data.length
        double variance = result/data.length;

        //  square root of variance
        double sd = Math.sqrt(variance);

        return sd;
        
    }

    public static void main(String[] args) {

        double[] numbers = new double[5];

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextDouble();
        }
        
        SD s= new SD();
        double sd =  s.calculateSD(numbers);
        
        System.out.println(sd);

        input.close();
    }
}
