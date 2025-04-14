package MaHoa.Bai2;

public interface Encryptable {
    String encrypt(String password) throws Exception;
    String decrypt(String password) throws Exception;
}
