package arrays;

public class Max {
    public static void main(String[] args) {
        int [] arr = {1, 23, 4 ,35,87,45};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }

        int maxVal =  arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
