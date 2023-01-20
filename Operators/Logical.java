public class Logical {
    public static void main(String[] args) {
        int a = 5, b = 9, c = 3;
        //AND
        System.out.println(a<b && b>c);
        System.out.println(a<b && c==a);
        //OR
        System.out.println(a>=b || b>c);
        System.out.println(a>b || c>a);
    }
}
