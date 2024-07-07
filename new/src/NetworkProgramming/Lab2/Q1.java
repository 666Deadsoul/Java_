package NetworkProgramming.Lab2;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Q1 {
    public static void main(String[] args) {
        try{
            Socket s= new Socket("www.google.com",80);
            System.out.println("Connected to "+ s.getInetAddress()+ " on port "+ s.getPort() + " from port "+ s.getLocalPort()+ " of "+ s.getLocalAddress());
            s.close();
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
        catch(SocketException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
