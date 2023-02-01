package controlStatement;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        do{
            number = sc.nextInt();
            if(number<0) break;
            sum += number;
        }while(true);
        System.out.println("Sum: " + sum);
    }
}
