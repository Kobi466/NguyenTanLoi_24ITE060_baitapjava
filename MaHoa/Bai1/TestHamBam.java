package MaHoa.Bai1;

import java.security.MessageDigest;

public class TestHamBam {
    public static void main(String[] args) {
        String password = "2006";
        System.out.println(hashPassword(password));
    }
    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());

            StringBuilder hex = new StringBuilder();
            for (byte b : hashBytes) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
