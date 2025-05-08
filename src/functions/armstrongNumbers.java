package functions;

// print all the tree digits armstrong numbers

import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
//        boolean ans = isArmstrong(n);
        System.out.print("All the three digit Armstrong Numbers - ");
        for( int i =100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n ;
        int sum = 0 ;

        while (n > 0){
            int rem = n % 10;
            n = n /10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }

}
