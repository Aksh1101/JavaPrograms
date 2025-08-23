package assignment1;

import java.util.Scanner;


public class problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            String a = sc.next();

            if(a.equalsIgnoreCase("x")){
                break;
            }

            int num = Integer.parseInt(a);
            sum += num;
        }
        System.out.println("final sum is " + sum);
        sc.close();
    }
}
