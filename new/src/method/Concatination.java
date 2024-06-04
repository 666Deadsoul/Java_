package method;

import java.util.Scanner;

public class Concatination {
    void Conc(String s1, String s2){
        System.out.println(s1+s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        Concatination c = new Concatination();
        c.Conc(s1, s2);
        sc.close();
    }
}
