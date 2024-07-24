package NetworkProgramming.Lab2;
import java.net.*;
import java.io.*;

//ServerSocketConnection
public class Qno6 {
    public static void main(String[] args) {
        try{
        ServerSocket serverSocket=new ServerSocket(4567);
        System.out.println("Waiting for connection...");
        Socket clientSocket=serverSocket.accept(); 
        System.out.println("Connection established...");
        BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter pw=new PrintWriter(clientSocket.getOutputStream(),true);
        String inputLine;
        while((inputLine=br.readLine())!=null) {
            System.out.println("\nServer:" + inputLine);
            pw.println(inputLine);
        }
        serverSocket.close();
    } 
    catch (IOException e) {
        e.printStackTrace();
    }
}
}

