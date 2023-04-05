package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("D:\\stuff\\demo.txt");
            FileOutputStream fos = new FileOutputStream("D:\\stuff\\demo3.txt");

            byte[] b = new byte[1024];
            while(fis.read(b) > 0){
                fos.write(b);
            }
            fis.close();
            fos.close();
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
