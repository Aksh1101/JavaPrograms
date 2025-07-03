package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */


        // defining the no. of rows is mandatory, not columns
        int [][] arr = {
                {1,2,3,4},// 0th index // no of column doesn't matter
                {4,5,},// 1st index
                {6,7,8,9,10}// 2nd index
        };
        System.out.println(Arrays.deepToString(arr));


        // taking input for the array
        Scanner input = new Scanner(System.in);
        int [][] array = new int[3][3];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }
        // output
        System.out.println(Arrays.deepToString(array));

        // output
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        //output
//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }
        // using enhanced for loop
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }


    }
}
