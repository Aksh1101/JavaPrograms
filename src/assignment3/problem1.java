package assignment3;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.printf("Area is %.2f%n", area);
    }
}
