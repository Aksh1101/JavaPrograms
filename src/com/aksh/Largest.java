package com.aksh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers respectively - ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q- Find the largest of three numbers
        int max = a;
        if (b > max){
            max = b ;
        }
        if (c > max){
            max = c;
        }
        System.out.println("Largest number - " + max );


    }
}
// max = Math.max(c,(Math.max(a,b))) , can also use Math class
