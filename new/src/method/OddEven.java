package method;
import java.util.Scanner;
public class OddEven {
    public boolean Checker(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        OddEven oe = new OddEven();
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean status = oe.Checker(num);
        if(status){
            System.out.println("It is Even");
        }else{
            System.out.println("It is Odd");
        }
    sc.close();
    }  
}
