package bitwiseOperators;

public class CountSetBits {
    // find the number of set bits in n
    public static void main(String[] args) {

        int n = 45;
        // to see the binary representation
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));


    }
    static int countSetBits(int n) {
        int count = 0;

//        while (n > 0){
//            count++;
//            n -= n & (-n);
//
//        } another approach

        while (n > 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
