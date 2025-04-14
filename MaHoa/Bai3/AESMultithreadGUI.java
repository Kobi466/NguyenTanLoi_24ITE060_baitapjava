package MaHoa.Bai3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AESMultithreadGUI extends JFrame {
    private JTextField inputField;
    private JTextArea encryptArea;
    private JTextArea decryptArea;

    private String encryptedText = null;

    public AESMultithreadGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);

        inputField = new JTextField();
        encryptArea = new JTextArea(3, 30);
        decryptArea = new JTextArea(3, 30);
        JButton encryptButton = new JButton("Ma Hoa");

        encryptArea.setLineWrap(true);
        decryptArea.setLineWrap(true);

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(new JLabel("Nhap chuoi"));
        panel.add(inputField);
        panel.add(encryptButton);
        panel.add(new JScrollPane(encryptArea));
        panel.add(new JScrollPane(decryptArea));

        add(panel);

        encryptButton.addActionListener(this::handleEncrypt);
    }

    private void handleEncrypt(ActionEvent e) {
        String input = inputField.getText();
        encryptArea.setText("");
        decryptArea.setText("");

        Thread encryptThread = new Thread(() -> {
            try {
                encryptedText = AESUtil.encrypt(input);
                encryptArea.setText("Ma Hoa: " + encryptedText);
                Thread decryptThread = new Thread(() -> {
                    try {
                        String decrypted = AESUtil.decrypt(encryptedText);
                        decryptArea.setText("Giai ma hoa: " + decrypted);
                    } catch (Exception ex) {
                        decryptArea.setText("That bai");
                        ex.printStackTrace();
                    }
                });
                decryptThread.start();

            } catch (Exception ex) {
                encryptArea.setText("That Bai");
                ex.printStackTrace();
            }
        });

        encryptThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AESMultithreadGUI().setVisible(true));
    }
}

