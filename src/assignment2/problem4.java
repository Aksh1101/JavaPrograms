package assignment2;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number ");
        int a = input.nextInt();
        System.out.print("Enter number ");
        int b = input.nextInt();
        System.out.print("Enter operator like +,-,*,/ ");
        char op = input.next().charAt(0);

        int result = 0;



        if(op == '+'){
              result = a+b;
        }
        else if(op == '-'){
             result = a-b;
        }
        else if(op == '*'){
             result = a*b;
        }
        else if(op == '/'){
            result = a/b;
        }
        else{
            System.out.println("Invalid operator");
            return;
        }
        System.out.println("Result is " + result );
    }
}
