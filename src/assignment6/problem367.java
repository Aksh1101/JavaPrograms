package assignment6;

public class problem367 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(perfectSquare(x));
    }
    public static boolean perfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if (square > num) {
                end = mid - 1;
            } else if (square < num){
                start = mid + 1;
            }else  {
                return true;
            }
        }
        return false;
    }
}
