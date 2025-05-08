package functions;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greeting();
    }
    static void greeting(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name - ");
        String name = input.nextLine();
        System.out.println("Hello " + name);


    }
}
