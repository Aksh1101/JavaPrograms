package assignment6;

public class problem69 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt(x));

    }
    public static int sqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid =  start + (end - start) / 2;
            long square = (long) mid * mid;

            if(square <= x){
                ans = mid;
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
