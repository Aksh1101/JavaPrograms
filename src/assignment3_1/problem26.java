package assignment3_1;

import java.util.Scanner;
// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            int N = input.nextInt();
            if(N < 0){
                N = N * -1;
            }
            sum += N;
            if(N == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
