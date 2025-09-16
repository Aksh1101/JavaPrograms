package recusion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,2,67,34,72,8,3};
        System.out.println(Arrays.toString(mergeSort(arr)));
        // here original array is not modified
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        // here we have created the copy of that array according to our need
        // here we have created a new object
        // that's why we have to return it
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix =  new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may ne possible that one of the arrays is not complete
        // add all remaining element
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
