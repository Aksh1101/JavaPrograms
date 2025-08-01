package otherProblems;

public class rotationCount {
    // here we have to count the number of times the array is rotated
    // answer will the pivot + 1 times
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2,3,3};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
       int pivot = findPivotWithDuplicates(arr);
       return pivot +1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at a middle, start, end are equal then just skip duplicates
            if (arr[mid] == arr[start] &&  arr[mid] == arr[end]) {
                // skip the duplicate
                // Note what if these elements at start and end were the pivots?
                // check if start is pivot
                if (arr[start] > arr[start +1]){
                    return start;
                }
                start++;
                // check end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end++;
            }
            // the left side is sorted so pivot should be in right
            else if (arr[start]< arr[mid] || arr[mid] == arr[start] && arr[mid] > arr[end]){
                start = mid + 1;
            }else  {
                end = mid - 1;
            }
        }
        return -1;
    }

}
