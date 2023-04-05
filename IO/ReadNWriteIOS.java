package IO;
import java.io.*;
import java.util.Scanner;

public class ReadNWriteIOS {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to store data, 2 to print data");
            int choice = sc.nextInt();

            if (choice == 1) {
                String data = "Something to write in file.";

                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\stuff\\demo.txt"));
                bos.write(data.getBytes());
                bos.close();

                System.out.println("Data stored successfully");
            } else if (choice == 2) {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\stuff\\demo.txt"));
                byte[] dataBytes = bis.readAllBytes();
                String data = new String(dataBytes);

                System.out.println("Data from file: " + data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
