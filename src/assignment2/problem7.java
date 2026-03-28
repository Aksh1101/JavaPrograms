package assignment2;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = input.nextInt();
        int a = 0 , b = 1;
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
