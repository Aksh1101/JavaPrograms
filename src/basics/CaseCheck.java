package basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         char ch = input.next().trim().charAt(0);
         // just to take the first letter if somebody inputs string as there is no direct way
        if (ch >= 'a' && ch<= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
