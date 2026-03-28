package assignment2;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number - ");
        int N1 = input.nextInt();
        System.out.print("Please enter the second number - ");
        int N2 = input.nextInt();
        if (N1 > N2){
            System.out.println("The first number is greater than the second number");
        }else
            System.out.println("The second number is greater than the first number");
    }
}
