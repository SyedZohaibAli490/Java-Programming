package SocketString;
import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is listening on port 1234...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                CustomString customString = (CustomString) ois.readObject();
                String response = customString.getMaxCharacterCount();

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println(response);

                clientSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
