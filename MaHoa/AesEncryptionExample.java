package MaHoa;

// File: AesEncryptionExample.java
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AesEncryptionExample {

    // Mã hóa văn bản với AES
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Giải mã văn bản đã mã hóa
    public static String decrypt(String cipherText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(cipherText);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    public static void main(String[] args) throws Exception {
        String originalText = "Xin chào thế giới!";

        // Tạo khóa AES 128 bit
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        // Mã hóa
        String encryptedText = encrypt(originalText, secretKey);
        System.out.println("Mã hóa: " + encryptedText);

        // Giải mã
        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("Giải mã: " + decryptedText);
    }
}

