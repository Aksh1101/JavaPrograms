package linearSearch;

public class searchInRange {
    // search the target in the array in between index 1 to 9
    public static void main(String[] args) {
        int [] arr = { 1, 2, 14, 5, 6, 78, 8, 9, 17, 11, 12, 13, 14, 15 };
        int target = 9;
        System.out.println(linearSearch(arr, target, 1 , 9));
        // this will return the index of the target in the array
    }
    static int linearSearch(int[] arr, int target , int start, int end) {
        if  (start > end) {
            return -1;
        }
        if (arr.length == 0){
            return -1;
        }
        for  (int i = start ; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
