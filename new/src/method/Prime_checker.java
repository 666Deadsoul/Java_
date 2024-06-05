package method;

import java.util.Scanner;

public class Prime_checker {
    public boolean Checker(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        Prime_checker m= new Prime_checker();
        boolean state = m.Checker(num);
        if(state){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
     sc.close();
    }
}
