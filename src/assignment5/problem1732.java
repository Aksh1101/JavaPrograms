package assignment5;

public class problem1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int alt =0;
        int maxAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            if (alt > maxAlt) {
                maxAlt = alt;
            }
        }
        System.out.println(maxAlt);
    }
}
