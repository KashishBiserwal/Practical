package IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FRW {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:\\stuff\\demo2.txt");
            fw.write("hey, wassup!!!");
            fw.close();

            FileReader fr = new FileReader("D:\\stuff\\demo2.txt");
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i );
            }
            fr.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
