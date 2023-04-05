package IO;

import java.io.FileOutputStream;

public class WriteFOS {
    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("D:\\stuff\\demo.txt");
            String s = "something";
            byte[] b = s.getBytes();
            f.write(b);
            f.write(10);  //10 represents new line in ASCII
            f.write(68);
            f.close();
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
