package assignment3_1;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total sales amount ");
        double sales_amount = input.nextDouble();
        System.out.print("Enter Commission Amount ");
        double commission_amount = input.nextDouble();

        double commission_rate = (commission_amount / sales_amount) * 100;
        System.out.println("Commission Rate is " + commission_rate);
    }
}
