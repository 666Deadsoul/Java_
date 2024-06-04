package method;

public class Palindrom {
    public void checker(int num){
        int rev=0;
        int number=num;
       while(number!=0){
        int div=number%10;
        number=number/10;
        rev= (rev*10)+div;
       }
        if(num == rev){
            System.out.println(num+" is Palindrom");
        }
        else{
            System.out.println(num +" is not Palindrom");
        }
    }
    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        p.checker(102201);
    }
}
