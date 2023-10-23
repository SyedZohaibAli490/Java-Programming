package SOCKET;

import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket that listens on port 1234
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is listening on port 1234...");

            while (true) {
                // Wait for a client to connect
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create input and output streams for communication
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Read the message from the client
                String clientMessage = in.readLine();
                if (clientMessage != null) {
                    // Process the message and send a response
                    String response = "Walikum Salam " + clientMessage.substring(16); // Extract the name from the client's message
                    out.println(response);
                }

                // Close the connection
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
