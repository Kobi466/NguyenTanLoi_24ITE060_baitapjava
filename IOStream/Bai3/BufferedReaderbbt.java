package Week3_IOStream.Bai3;

import java.io.*;

public class BufferedReaderbbt {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\ADMIN\\Documents\\TepText\\fileWriteBai2.txt");
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
    }
}
