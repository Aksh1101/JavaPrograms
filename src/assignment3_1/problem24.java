package assignment3_1;

import java.util.Scanner;
//Sum Of A Digits Of Number
public class problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = input.nextInt();
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("The sum is " + sum);
    }
}
