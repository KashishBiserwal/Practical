package IO;

import java.io.*;
import java.util.Scanner;

public class ReadNPrint {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to store data, 2 to print data");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter data to store:");
            String data = sc.next();

            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\stuff\\demo.txt"));
            writer.write(data);
            writer.close();

            System.out.println("Data stored successfully");
        } else if (choice == 2) {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\stuff\\demo.txt"));
            String data = reader.readLine();
            reader.close();

            System.out.println("Data from file: " + data);
        }
    }
}

