package assignment3_1;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String - ");
        String str = input.nextLine();
        // shortcut
        // String reversed = new StringBuilder(str).reverse().toString();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.print("Reversed String "+ reversed);
    }
}
