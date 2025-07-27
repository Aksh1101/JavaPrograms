package linearSearch;

public class linerSearch03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 14, 5, 6, 78, 8, 9, 17, 11, 12, 13, 14, 15 };
        int target = 9;
        boolean ans  = linearSearch(arr, target);
        System.out.println(ans);

    }
    // search in the array, return the True/False if the item found
    // otherwise return -1 if not found
    static boolean linearSearch(int[] arr, int target){
        if (arr.length == 0) return false;

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for an element at every index if it is = target
            if (arr[index] == target) return true;
        }
// this line will execute if target value is noty found in the array
        return false;
    }
}

