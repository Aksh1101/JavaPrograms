package assignment1;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year to be checked as Leap Year - ");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));



    }
    static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        else return false;
    }
}
