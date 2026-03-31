package assignment3_1;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value od x1 ");
        double x1 = input.nextDouble();
        System.out.print("enter the value od y1 ");
        double y1 = input.nextDouble();
        System.out.print("enter the value od x2 ");
        double x2 = input.nextDouble();
        System.out.print("enter the value od y2 ");
        double y2 = input.nextDouble();

        double xdiff = x2 - x1;
        double ydiff = y2 - y1;

        double distance = Math.hypot(xdiff, ydiff);

        System.out.println("The distance between two points is " + distance);


    }
}
