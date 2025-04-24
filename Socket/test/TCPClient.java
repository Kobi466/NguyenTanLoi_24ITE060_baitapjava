package Socket.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 9999);
            //Tao luong doc va ghi
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //gui du lieu den server
            out.println("Xin chao, toi la TCPClient");
            String messageFromServer = in.readLine();
            System.out.println("Nhan du lieu tu Server: "+messageFromServer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
