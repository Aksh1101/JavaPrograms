package linearSearch;

public class findMIn {
    // find minimum element number in the array
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, -38, 67, 243, 75, 89, -5};
        System.out.println(minimum(arr));
    }
    // assume arr is not empty
    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
/*
if I want to search in between ranges, then just define the start and till when the loop runs,
and then you get the result
 */


