package Socket.BaiTap;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class ChatClient extends JFrame{
    private JTextField messageField = new JTextField();
    private JTextArea chatArea = new JTextArea();
    private JTextField ipField = new JTextField("127.0.0.1");
    private JTextField portField = new JTextField("12345");
    private JTextField usernameField = new JTextField();
    private JButton t_Gui = new JButton("Gửi");
    private JButton bt_ketNoi = new JButton("Kết nối");

    private Socket socket;
    private PrintWriter out;

    public ChatClient() {
        this.chatArea.setEditable(false);
        JPanel messagePanel = new JPanel(new BorderLayout());
        messagePanel.add(new JLabel("Tin nhắn:"), BorderLayout.WEST);
        messagePanel.add(messageField, BorderLayout.CENTER);
        messagePanel.add(t_Gui, BorderLayout.EAST);

        JPanel connectPanel = new JPanel(new GridLayout(2, 5));
        connectPanel.add(new JLabel("IP:"));
        connectPanel.add(ipField);
        connectPanel.add(new JLabel("Port:"));
        connectPanel.add(portField);
        connectPanel.add(bt_ketNoi);
        connectPanel.add(new JLabel("Tên người dùng:"));
        connectPanel.add(usernameField);

        this.getContentPane().add(connectPanel, BorderLayout.NORTH);
        this.getContentPane().add(new JScrollPane(chatArea), BorderLayout.CENTER);
        this.getContentPane().add(messagePanel, BorderLayout.SOUTH);

        bt_ketNoi.addActionListener(e -> ketNoi());
        t_Gui.addActionListener(e -> sendMessage());
        messageField.addActionListener(e -> sendMessage());

        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void ketNoi() {
        try {
            socket = new Socket(ipField.getText(), Integer.parseInt(portField.getText()));
            out = new PrintWriter(socket.getOutputStream(), true);
            //gui ten nguoi dung sau khi ket noi
            out.println(usernameField.getText());
            new Thread(new DocDulieu()).start();
            chatArea.append("Kết nối thành công!\n");
        } catch (IOException ex) {
            chatArea.append("Không thể kết nối đến server\n");
        }
    }

    private void sendMessage() {
        if (out != null) {
            out.println(messageField.getText());
            messageField.setText("");
        }
    }

    private class DocDulieu implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    chatArea.append(message + "\n");
                }
            } catch (IOException ex) {
                chatArea.append("Mất kết nối với server\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatClient::new);
    }
}