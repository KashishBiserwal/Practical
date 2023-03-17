package String;

public class DivideString {
    public static void main(String[] args) {
        String s = "This is a string";
        int n = 4;
        int part = s.length()/n;
        while(n != 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < part; i++) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
            s = s.substring(part);
            n--;
        }
    }
}
