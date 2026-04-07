package assignment5;

public class problem1672 {
    public static void main(String[] args) {
        int [][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,8}
        };
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        System.out.println(maxWealth);

    }
}
