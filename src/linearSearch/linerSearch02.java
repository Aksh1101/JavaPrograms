package linearSearch;

public class linerSearch02 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 14, 5, 6, 78, 8, 9, 17, 11, 12, 13, 14, 15 };
        int target = 78;
        int ans  = linearSearch(arr, target);
        System.out.println(ans);

    }
    // search in the array, return the element if the item found
    // otherwise return -1 if not found
    static int linearSearch(int[] arr, int target){

        // run a for loop
        for (int element : arr) {
            if (element == target) return element;
        }
// this line will execute if target value is noty found in the array
        return Integer.MAX_VALUE;
    }
}

