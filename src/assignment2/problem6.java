package assignment2;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees ");
        double amount = input.nextDouble();
        double USD = 94.86;
        double rate = amount/USD;
        System.out.printf("%.2f",rate);
    }
}
