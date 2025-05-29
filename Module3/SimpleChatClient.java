import java.io.*;
import java.net.*;

public class SimpleChatClient{
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg, serverMsg;

        while (true) {
            System.out.print("Client: ");
            clientMsg = userInput.readLine();
            output.println(clientMsg);
            if ("bye".equalsIgnoreCase(clientMsg)) break;

            serverMsg = input.readLine();
            System.out.println("Server: " + serverMsg);
        }
        clientSocket.close();
    }
}
