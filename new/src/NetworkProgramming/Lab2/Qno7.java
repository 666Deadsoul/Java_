package NetworkProgramming.Lab2;

import java.net.*;
import java.io.*;
import java.util.*;

public class Qno7 {
    private static final int PORT = 9000;
    private static List<ClientHandler> clients = new ArrayList<>();
    private static int nextUserId = 1;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running on port " + PORT);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");
                ClientHandler clientHandler = new ClientHandler(clientSocket, "User" + nextUserId);
                nextUserId++;
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
        private String username;

        public ClientHandler(Socket socket, String username) {
            this.clientSocket = socket;
            this.username = username;
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
        try {
            out.println("You are connected as: " + username);
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println(username + ": " + message);
                broadcastMessage(username + ": " + message, this);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                in.close();
                out.close();
                clientSocket.close();
                clients.remove(this);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

        private void broadcastMessage(String message, ClientHandler sender) {
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.sendMessage(message);
                }
            }
        }

        private void sendMessage(String message) {
            out.println(message);
        }
    }
}
