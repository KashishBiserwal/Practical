package Regex;

import java.util.regex.Pattern;

//Quantifiers
//x? - x occur once or not at all   [abc]?
//x+ -- x occur once or more than once
//x*  - x occur zero or more time
//x{n} - x occur n time
//x{7} - x occur only 7 character//single character
//x{n,} - x occur n or more time x(7) only 7 char or more

public class Regex_3 {
    public static void main(String[] args) {
        boolean b1= Pattern.matches("[A-Za-z0-9]{12}","Anudip123ppp");
        System.out.println(b1);
        boolean b2= Pattern.matches("[A-Z a-z 0-9.@]{19,}","Pallabi.Anudip@2023");
        System.out.println(b2);
        boolean b3= Pattern.matches("[0-9]{10}","9878965413");
        System.out.println(b3);
        boolean b4= Pattern.matches("[6789]{1}[0-9]{9}","9878965413");
        System.out.println(b4);
        boolean b5= Pattern.matches("[A-Za-z0-9.@]{30,}","anojkumar1245045655@gmail.comg");
        System.out.println(b5);

    }
}
