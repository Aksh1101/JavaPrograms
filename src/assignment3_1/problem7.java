package assignment3_1;

import java.util.Scanner;

public class problem7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number - ");
        int n = sc.nextInt();
        System.out.print("enter the exponent - ");
        int x = sc.nextInt();
        int power = 1;

        for (int i = 1; i <= x; i++) {
            power = power * n;
        }
        System.out.println(n + "^" + x + " is " + power);
    }
}
