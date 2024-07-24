package NetworkProgramming.Lab2;

import java.io.*;
import java.net.*;
import java.util.*;

//client socket connection

public class Qno5 {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for connection...");
            Socket s= new Socket("localhost",4567);
            System.out.println("Connected to server...");
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream())); 
            PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
            Scanner scanner=new Scanner(System.in);
            while(true) { 
                System.out.println("Enter text: ");
                String inputLine=scanner.nextLine(); 
                if(inputLine.equalsIgnoreCase("quit")) { 
                    break;
                }
                pw.println(inputLine);
                String response=br.readLine();
                System.out.println("Server: " + response); 
            }
            s.close();
            scanner.close();
        } 
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
