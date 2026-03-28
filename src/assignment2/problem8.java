package assignment2;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.nextLine();

        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        if (string.equals(reversed)) {
            System.out.println("Palindrome");
        }
        else  {
            System.out.println("Not Palindrome");
        }
    }
}
