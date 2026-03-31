package assignment3_1;

import java.util.Scanner;

// Perfect Number In Java
// 6 has divisors 1,2,3 and their sum 6 that's why 6 is a perfect number
public class problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int N = input.nextInt();
        int sum = 0;

        for(int i = 1; i < N; i++ ){
            if(N % i == 0){
                sum += i;
            }
        }
        if(sum == N){
            System.out.println("N is a perfect number");
        }else {
            System.out.println("N is not a perfect number");
        }
    }
}
