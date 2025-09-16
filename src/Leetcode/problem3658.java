package Leetcode;

import java.math.BigInteger;

public class problem3658 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(evenSum(n));
        System.out.println(oddSum(n));
        System.out.println(gcdOfOddEvenSums(n));

    }
    static int gcdOfOddEvenSums(int n){
        int a = oddSum(n);
        int b = evenSum(n);
        return gcd(a,b);
    }

    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    static int oddSum(int n){
        if(n==0){
            return 0;
        }
        return 2*n-1 + oddSum(n-1);
    }
    static int evenSum(int n){
        if(n==0){
            return 0;
        }
        return 2*n + evenSum(n-1);
    }


}
