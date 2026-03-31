package assignment3;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.printf("Area is %.2f%n", area);
    }
}
