package Week3_IOStream;

import java.io.*;
class ex1 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\ADMIN\\Documents\\TepText\\1.txt");
        File file2= new File("C:\\Users\\ADMIN\\Documents\\TepText\\2.txt");
        ThreadIO threadIO = new ThreadIO();
        Thread t1 = new Thread(new Output(file1, threadIO));
        Thread t2 = new Thread(new Output(file2, threadIO));
        t1.start();
        t2.start();
    }
}
class ThreadIO {
    public final Object lock = new Object();
    public void input(File filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        File file = new File(filePath.getPath());
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while(!(line = bufferedReader.readLine()).equals("exit")){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
    public void output(File getPath) throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Documents\\TepText\\Ouput.txt");
        synchronized (lock) {
            FileReader fileReader = new FileReader(getPath.getPath());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;

            while((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedReader.close();
        }
        System.out.println("File written to " + getPath.getPath());
    }
}
class Input implements Runnable{
    private File file;
    private ThreadIO threadIO;
    public Input(File file, ThreadIO threadIO) {
        this.file = new File(file.getPath());
        this.threadIO = threadIO;
    }
    @Override
    public void run() {
        try {
            threadIO.input(new File(file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Output implements Runnable{
    private File file;
    private ThreadIO threadIO;
    public Output(File file, ThreadIO threadIO) {
        this.file = new File(file.getPath());
        this.threadIO = threadIO;
    }

    @Override
    public void run() {
        try {
            threadIO.output(new File(file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
