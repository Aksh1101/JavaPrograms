package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fruit : ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("An apple a keeps Doctor away");
            case "Banana" -> System.out.println("Good for gymbois");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("Small Fruit ");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
// here we have changed the traditional switch statement to enhanced switch statement
