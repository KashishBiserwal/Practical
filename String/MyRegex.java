package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    public static boolean validation(String ip) {
        String range = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = range + "\\."+ range + "\\." + range + "\\." + range;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(ip);
        return m.matches();
    }

    public static void main(String[] args) {
        String str1 = "000.12.12.034";
        System.out.println(validation(str1));

        String str2="121.234.12.12";
        System.out.println(validation(str2));

        String str3="23.45.12.56";
        System.out.println(validation(str3));

        String str4="00.12.123.123123.123";
        System.out.println(validation(str4));

        String str5="122.23";
        System.out.println(validation(str5));

        String str6="Hello.IP";
        System.out.println(validation(str6));
    }
}
