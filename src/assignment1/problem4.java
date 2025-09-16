package assignment1;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.print("Enter 1st number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int b = sc.nextInt();

        System.out.println("HCF is " + gcd(a,b));
        System.out.println("LCM is " + lcm(a,b));

    }
    static int gcd(int a,int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }

}
