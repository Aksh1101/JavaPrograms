package assignment3_1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Original Price - ");
        double price = input.nextDouble();
        System.out.print("enter the Discount");
        double discount = input.nextDouble();
        double newPrice = price * (discount/100);
        System.out.println("New Price - " + newPrice);
    }
}
