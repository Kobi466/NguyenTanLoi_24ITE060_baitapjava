package Week3_IOStream.Bai1;

import java.io.*;

public class FileInputStreamex {
    public static void main(String[] args) {
        try{
            FileInputStream readFile = new FileInputStream("C:\\Users\\ADMIN\\Documents\\TepText\\filereadbai1.txt");
            FileOutputStream writeFile = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\TepText\\filewritebai1.txt");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = readFile.read(buffer)) != -1) {
                writeFile.write(buffer, 0, length);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
