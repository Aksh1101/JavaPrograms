package bitwiseOperators;

public class findUnique1 {
    public static void main(String[] args) {
        // find the unique number in the array
        int [] arr = {2,7,-2,6,-7,9,-9};
        System.out.println(unique(arr));

    }
    static int unique(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique += n;
        }
        return unique;
    }
}
