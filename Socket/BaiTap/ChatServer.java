package Socket.BaiTap;
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static final Set<ClientHandler> clients = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server running on port " + PORT);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("New client connected: " + clientSocket);
            new Thread(new ClientHandler(clientSocket)).start();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;
        private String username;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                this.username = in.readLine();
                clients.add(this);
                broadcast("[Server]: " + username + " đã tham gia.");
                String message;
                while ((message = in.readLine()) != null) {
                    broadcast("[" + username + "]: " + message);
                    System.out.println("Client "+this.username+" da gui tin nhan: " + message);
                }
            } catch (IOException e) {
                System.out.println("Client disconnected: "+username);
            } finally {
                clients.remove(this);
                broadcast("[Server]: " + username + " đã rời đi.");
                try {
                    socket.close();
                } catch (Exception e) {

                }
            }
        }

        private void broadcast(String message) {
            synchronized (clients) {
                for (ClientHandler client : clients) {
                    client.out.println(message);
                }
            }
        }
    }
}