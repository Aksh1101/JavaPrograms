package com.aksh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name - ");
        String Name = input.nextLine();// this is for input a line
        System.out.print("Enter Roll No - ");
        int RollNo = input.nextInt();
        System.out.print("Enter Class - ");
        String Class = input.next();// for the first word of the input
        System.out.print("Enter the Marks");
        float Marks = input.nextFloat();
        System.out.println("Name - " + Name);
        System.out.println("Roll No -  " + RollNo);
        System.out.println("Class - " + Class);
        System.out.println("Marks - " + Marks);
    }
}
