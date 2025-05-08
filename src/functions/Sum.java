package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Q- take input of two numbers and print the sum
        //sum();
        int answer = sum3(50,99);
        System.out.println("The Total is - " + answer);

    }

// pass the value of numbers when you are calling the method in main() by using parameters
static  int sum3(int a, int b){
        int sum = a + b;
        return sum;

}

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum - " + sum);
    }
    // return the value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = input.nextInt();
        int total = num1 + num2;
        return total;
    }
    /*
     return_type name(){
        //body
        return statement;}

     */
}
