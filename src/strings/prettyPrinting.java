package strings;

import java.util.ArrayList;

public class prettyPrinting {
    public static void main(String[] args) {
        float a = 234.3756f;
        // now we want to print with it only two decimal numbers
        System.out.printf("Formatted number - %.2f", a);
        System.out.println();
        // % is the placeholder and printf is used to print this kind of things
        // printf is also rounds off the number

        System.out.printf("Value of Pie - %.2f", Math.PI);
        System.out.println();
        System.out.printf("My name is %s and I am %s %n", "Aksh","Specy");
        // the order you placed the placeholder in the same way you have to add the values
        // there are so many placeholders in java string to format the string
        //%n is for the new line

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 1);

        System.out.println("math" + new  ArrayList<>());

    }
}
