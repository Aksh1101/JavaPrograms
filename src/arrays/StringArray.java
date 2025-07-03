package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array of objects

        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.next();
        }
        System.out.println(Arrays.toString(array));

        // modify a original string object
        array[1] = "idea";
        System.out.println(Arrays.toString(array));


    }
}
