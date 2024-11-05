package com.aksh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the EmpID - ");
        int empID = input.nextInt();
        System.out.print("Enter thr Department - ");

        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("Rio");
            case 2 -> System.out.println("Dean");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("No/Wrong Department Entered");
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }

    }
}
