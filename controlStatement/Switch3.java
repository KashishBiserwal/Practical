package controlStatement;

public class Switch3 {
    public static void main(String[] args) {
        char op = '-';
        int a = 10, b = 5;
        switch (op){
            case '-':
                System.out.println("a - b = " + (a-b));
                break;
            case '+':
                System.out.println("a + b = " + (a+b));
                break;
            case '*':
                System.out.println("a * b = " + (a*b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
