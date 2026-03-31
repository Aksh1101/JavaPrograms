package assignment3;

import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            int N = input.nextInt();
            sum += N;
            if(N == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
