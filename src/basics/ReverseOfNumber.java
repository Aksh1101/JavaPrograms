package basics;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed - ");
        int number = input.nextInt();
        int ans = 0;
        while(number >0){
            int rem = number % 10;
            ans = ans *10 + rem;
            number /= 10;

        }
        System.out.println("Reversed Number - "+ans);
    }
}
