package basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = input.nextInt();
        int Sum = num1 + num2;
        System.out.println("Total of the numbers - " + Sum);


    }
}
