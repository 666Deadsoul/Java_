package arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String []args){
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.print("The sum of the array is: " + sum);
        sc.close();
    }
}
