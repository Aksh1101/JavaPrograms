package assignment3_1;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers - ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number - ");
            int num = input.nextInt();
            sum = sum + num;
        }
        double average = (double) sum/n;
        System.out.println("The average number is " + average);
    }
}
