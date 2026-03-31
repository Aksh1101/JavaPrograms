package assignment3_1;

import java.util.Scanner;

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
