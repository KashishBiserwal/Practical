package IO;


import java.io.FileInputStream;

public class FIS {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("D:\\stuff\\demo.txt");
            int i;
            while((i = f.read()) != -1){
                System.out.print((char)i);
            }
            f.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
