package NetworkProgramming.Lab2;
import java.net.*;
import java.io.*;
//lowport

public class Qno4 {
    public static void main(String[] args) {
        for(int i=1;i<1024;i++){
            try{
                Socket s = new Socket("localhost",80);
                System.out.println("There is sercer on port "+i+" of localhost");
                s.close();
            }
            catch(UnknownHostException e){
                System.out.println(e);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }        
    }    
}
