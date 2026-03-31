package assignment3_1;

import java.util.Scanner;

// Java Program Vowel Or Consonant
public class problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
            System.out.println("Vowel");
        }else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Consonant");
        }else {
            System.out.println("Invalid");
        }
    }
}
