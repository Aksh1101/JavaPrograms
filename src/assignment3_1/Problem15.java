package assignment3_1;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of n");
        int n  = input.nextInt();
        System.out.print("enter the value of r");
        int r  = input.nextInt();
        int nPr = factorial(n)/factorial(n-r);
        int nCr = factorial(n)/(factorial(r) * factorial(n-r));

        System.out.println("nPr is " + nPr);
        System.out.println("nCr is " + nCr);
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
