package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from the user till user does not press X or x
        int ans = 0;

        while(true){
            // take the operator as input
            System.out.print("Enter the Operator : ");
            char op  = input.next().trim().charAt(0);
            if (op == '+'|| op == '-'|| op == '*'|| op== '/' || op =='%'){
                // input two numbers
                System.out.print("Enter the first number : ");
                int num1 = input.nextInt();
                System.out.print("Enter the second number : ");
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '%'){
                    ans = num1 / num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if (num2 != 0){
                        ans = num1 % num2;
                    }
                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println("Result : " + ans);
        }
    }
}
