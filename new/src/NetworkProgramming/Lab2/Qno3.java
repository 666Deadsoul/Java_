package NetworkProgramming.Lab2;
import java.io.*;
import java.net.*;

//Highport
public class Qno3 {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("Localhost");
            for(int i=1024;i<65536;i++){
                try{
                    Socket s = new Socket(ad,i);
                    System.out.println("There is a server on port " + i + " of Localhost");
                    s.close();
                }
                catch(IOException e){
                    System.out.println(e);
                }
            }
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
    }    
}
