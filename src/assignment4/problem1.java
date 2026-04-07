package assignment4;

import oops.staticExample.StaticBlock;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number - ");
        int num3 = sc.nextInt();

        int largest = largest(num1, num2, num3);
        System.out.println("The largest number is " + largest);
        int least = least(num1, num2, num3);
        System.out.println("The least number is " + least);
    }
    static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }else if (b > a && b > c) {
            return b;
        }else if (c > a && c > b) {
            return c;
        }else  {
            return a;
        }
    }

    static int least(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }else if (b < a && b < c) {
            return b;
        }else if (c < a && c <b ) {
            return c;
        }else
            return a;
    }
}
