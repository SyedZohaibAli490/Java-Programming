package SocketString;

import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            CustomString customString = new CustomString("Hello, AMMAAD! How are you?");
            
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(customString);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverResponse = in.readLine();

            System.out.println("Server response: " + serverResponse);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
