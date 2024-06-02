package arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        int min=arr1[0];
        int max=arr1[0];
        for(int j=0;j<arr1.length;j++){
            if(min>arr1[j]){
                min=arr1[j];
            }
           if(max<arr1[j]){
                max=arr1[j];
           }
        }
        System.out.print("Maximum: "+ max + "\nMinimum: " + min);
        sc.close();
    }
}
