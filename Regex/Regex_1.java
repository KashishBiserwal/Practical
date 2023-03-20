package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1{
        public static void main(String[] args) {
            Pattern p= Pattern.compile(".s");
            Matcher m= p.matcher("ks");
            boolean b= m.matches();


            boolean b2= Pattern.compile(".s").matcher("ks").matches();


            boolean b3= Pattern.matches(".s", "ks");
            System.out.println(b+"\n"+b2+"\n"+b3);
        }
}
