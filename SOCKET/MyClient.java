package SOCKET;
import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost and port 1234
            Socket socket = new Socket("localhost", 1234);

            // Create input and output streams for communication
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a message to the server
            String message = "Hello My name is Ammaad"; // Replace "John" with your name
            out.println(message);

            // Receive and print the server's response
            String serverResponse = in.readLine();
            System.out.println("Server response: " + serverResponse);

            // Close the connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
