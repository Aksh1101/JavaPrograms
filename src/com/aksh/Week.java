package com.aksh;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Day - ");
        int day = input.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}

