package Socket.test;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server dang lang o cong 9999");
            Socket client = server.accept();
            System.out.println("Clien da ket noi: "+client.getInetAddress());
            //tao luong doc va ghi
            BufferedReader in = new BufferedReader(new java.io.InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            //Doc du lieu tu clien
            String messageByClient = in.readLine();
            System.out.println("Nhan tu TCPClient: "+messageByClient);
            //gui lai tin nhan cho client
            out.println("Xin chao toi la quai vat Server");
            //Dong ket noi
            client.close();
            server.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
