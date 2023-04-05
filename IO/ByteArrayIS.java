package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayIS {
    public static void main(String[] args) {
        byte[] arr = {68, 37, 35, 70 , 39};
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        int i;
        while((i = bais.read()) != -1){
            char c = (char) i;
            System.out.println("ASCII character " + i  + " value is " + c);
        }
    }
}
