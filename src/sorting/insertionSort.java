package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {0,1,35,-64,5,67,33,7,42,-98};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++){
            for (int j = i + 1; j > 0 ; j--){
                if (arr[j] < arr[j-1]){ // change the comparison sign to make descending order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                   arr[j-1] = temp;
                } else break;
            }
        }
    }

}
