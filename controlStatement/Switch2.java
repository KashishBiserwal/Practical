package controlStatement;

public class Switch2 {
    public static void main(String[] args) {
        char ch = 'k';
        switch (ch){
            case 'a':
                System.out.println("Executed 1st case");
                break;
            case 'b':
                System.out.println("Executed 2nd case");
                break;
            case 'k':
                System.out.println("Executed 3rd case");
                break;
            case 'c':
                System.out.println("Executed 4th case");
                break;
            default:
                System.out.println("Invalid char");
        }
    }
}
