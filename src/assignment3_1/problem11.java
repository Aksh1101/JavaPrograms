package assignment3_1;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total Principal amount ");
        double p = input.nextDouble();
        System.out.print("Enter the Annual Interest rate ");
        double r = input.nextDouble();
        System.out.print("Enter the number of compound per year ");
        int n = input.nextInt();
        System.out.print("Enter the time in years ");
        int t = input.nextInt();

        double amount = p * (Math.pow((1+(r/100)/n),(n*t)));
        double CI = amount - p;

        System.out.printf("Compound Interest  is %.2f%n", CI);
        System.out.printf("Total amount is %.2f%n" , amount);
    }
}
