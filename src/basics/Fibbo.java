package basics;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int z = 0;
        System.out.print("Fibonacci - "+ a +b );
        for (int i = 2; i <= n; i++) {
            z = a + b;
            a = b;
            b = z;
            System.out.print(z);
        }
        System.out.println();
        System.out.println("nth Fibonacci number - "+z);

    }
}
