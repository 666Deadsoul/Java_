import java.net.*;
public class Adcheck {
    public static void main(String[] args) {
        try{
            InetAddress w1 = InetAddress.getByName("www.googl.com");
            InetAddress w2 = InetAddress.getByName("www.google.com");
            if(w1.equals(w2)){
                System.out.println(w1 + " is equal to "+w2);
            }
            else{
                System.out.println(w1 + " is not equal to "+ w2);
            }
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
    }
}
