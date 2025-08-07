package pattern;

public class pattern30 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){
        // whenever iot is given numbers as output, try not to use index zero
        for(int row = 1; row <= n; row++){
            for (int spaces = 0; spaces < n-row; spaces++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}
