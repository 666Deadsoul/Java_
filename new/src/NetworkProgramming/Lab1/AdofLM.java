package NetworkProgramming.Lab1;

import java.net.*;
//lab1 qn 2
//Address of local Machine
public class AdofLM {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getLocalHost();
            System.out.println(ad);
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }    
}
