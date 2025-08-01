package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.logging.SocketHandler;

public class Reversing {
    public static void main(String[] args) {
        int [] arr = {1, 23, 45, 67,3 ,87, 34,2};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //
            swap(arr, start, end);
            start ++;
            end--;
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
