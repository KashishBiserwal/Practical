package String;

public class StringBufferEg{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is StringBuffer");

        sb.append(" - This is a sample program");
        System.out.println("After appending: " + sb);

        sb.insert(21, "Object");
        System.out.println("After inserting: " + sb);

        StringBuffer rev = sb.reverse();
        System.out.println("After reversing: " + rev);

        StringBuffer sb2 = new StringBuffer("This is StringBuffer");
        sb2.replace(14, 20, "Builder");
        System.out.println("After replacing: " + sb2);
    }
}
