package assignment3;

import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        while(true){
            int N = input.nextInt();
            if(N == 0){
                break;
            }
            if (N>temp){
                temp = N;
            }
        }
        System.out.println(temp);
    }
}
