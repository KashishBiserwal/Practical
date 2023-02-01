package controlStatement;

public class Switch {
    public static void main(String[] args) {
        int num = 10;
        switch (num){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}

/*System.out.println("");
        System.out.println("Pattern 8: Hollow Triangle");

        for (int i = 1; i <= n; i++) {
        for (int j = 1; j < 2 * n; j++) {
        if (j == (n - i + 1) || j == (n + i - 1)) {
        System.out.print("* ");
        }
        else if (i == n) {
        System.out.print("* ");
        }
        else {
        System.out.print("  ");
        }
        }
        System.out.println();
        }*/
