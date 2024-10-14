package com.aksh;

import java.util.Scanner;

public class NNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number u want the count on to be : ");
        int num = input.nextInt();
        for(int count = 1; count<= num; count ++){
            System.out.print(count + " ");
        }
    }
}
