package com.aksh;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // here i am inputting an  integer
        // explict type casting
        int num2 = (int)(67.98f);
        System.out.println(num2);
        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // 257 % 256 = 1 that why we get output as 1

        byte n = 40;
        byte m = 50;
        byte c = 100;
        int d = n*m / c;
        System.out.println(d);
        // here java is automatically promoting the type to int as byte is of only 256 but for solving expression it can do that
        // the use of Ascii
        int number = 'A';
        System.out.println(number);
    }
}
