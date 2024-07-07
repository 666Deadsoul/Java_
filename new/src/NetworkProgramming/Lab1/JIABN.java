package NetworkProgramming.Lab1;
import java.net.InetAddress;
import java.net.UnknownHostException;

//lab1 qn 1
//to find IP address of website
public class JIABN {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("www.google.com");
            System.out.println(ad);
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }    
}
