package Week3_IOStream.Bai2;

import java.io.*;

public class BufferedReaderBt {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Documents\\TepTest\\fileWriteBai2.txt");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        while (!(line = bufferedReader.readLine()).equals("exit")) {
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bufferedReader.close();
        bw.close();



    }
}
