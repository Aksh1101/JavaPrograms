package assignment3_1;

import java.util.Enumeration;
import java.util.Scanner;

// Find if a number is palindrome or not

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int n = input.nextInt();

        int original = n;
        int reversed = 0;

        while(n > 0){
            int digit = n % 10;
            reversed = reversed *10 + digit;
            n = n / 10;
        }
        if (original==reversed){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("The number is not palindrome");
        }

    }
}
