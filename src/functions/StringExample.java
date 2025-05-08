package functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String personalised = myGreet("Jarvis");
        System.out.println(personalised);


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the code - ");
        String code = in.next();
        String Code = myCode(code);
        System.out.println(Code);
    }

   static String myCode(String code){
        String output = "The code is " + code;
        return output;
   }


    static String myGreet(String name){
        String message  = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How u doin ?";
        return greeting;
    }
}
