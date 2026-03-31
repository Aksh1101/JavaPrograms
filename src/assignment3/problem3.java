package assignment3;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of triangle : ");
        double length = input.nextDouble();
        System.out.println("Enter the width of triangle : ");
        double height = input.nextDouble();
        double area = length * height;
        System.out.printf("Area is %.2f%n", area);
    }
}
