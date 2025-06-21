package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UsingForLoop {
    public static void main(String[] args) {
        System.out.print("Enter the elements of the array - ");
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0 ; i < arr.length; i++){
            arr [i] = input.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        // to print the whole array we nee to use Arrays.toString(array_name)

// we can also print this like this way
//        for(int i = 0 ; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for (int num : arr ){ // for every element in the array print the element
            System.out.println(num + " "); //here num represents the element of the array
        }// just another way of printing an array
        // this is called for each loop

    }
}
