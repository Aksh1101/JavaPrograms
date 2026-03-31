package assignment3_1;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number as integer - ");
        int num = input.nextInt();
        int factorial = 1;
        for  (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("The factorial is "+ factorial);
    }
}
