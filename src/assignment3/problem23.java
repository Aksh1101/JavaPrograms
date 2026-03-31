package assignment3;

import java.util.Scanner;

public class problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; i < N; i++){
            if(N % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
