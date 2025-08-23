package assignment1;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        System.out.print("Enter number - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" x " + i + " = "+ n*i);
        }
    }
}
