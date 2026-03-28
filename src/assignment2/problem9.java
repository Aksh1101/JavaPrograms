package assignment2;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of the range - ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number of the range - ");
        int n2 = sc.nextInt();

        for (int num = n1; num <= n2; num++) {
            int sum = 0;
            int original = num;

            // count digits
            int digits = String.valueOf(num).length();

            while (original > 0) {
                int digit = original % 10;
                sum += (int) Math.pow(digit, digits);
                original /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
