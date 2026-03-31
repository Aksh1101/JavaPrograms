package assignment3;

import java.util.Scanner;

public class problem1281 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int product = 1;
        int sum = 0;
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum += digit;
            n = n / 10;
        }
        result = product - sum;
        System.out.println(result);
    }
}
