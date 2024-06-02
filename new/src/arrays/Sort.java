package arrays;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int temp;
        for(int j=0;j<arr.length-1;j++){
            for(int k=0;k<arr.length-1-j;k++){
                if(arr[k]>arr[k+1]){
                    temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for(int n : arr){
            System.out.print(n + "\t");
        }
        sc.close();
    }
}
