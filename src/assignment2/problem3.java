package assignment2;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double principal = input.nextDouble();
        System.out.println("Enter the time in year");
        int time = input.nextInt();
        System.out.println("Enter the Rate");
        double rate = input.nextDouble();

        double SI = (principal * rate * time)/100;

        System.out.printf("%.2f",SI);


    }
}
