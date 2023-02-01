package controlStatement;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        while(true){
            number = sc.nextInt();
            if(number<0) break;
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
