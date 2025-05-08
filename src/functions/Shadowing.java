package functions;

public class Shadowing {
    static int x = 78; // this will be shadowed in line 8
    public static void main(String[] args) {
        System.out.println(x); // 78
        int x;// class variable is shadowed by this at line 4
        // shadowing is begin when the value is initialised
        x = 50;
        System.out.println(x);//50
        fun();
    }
    static void fun(){
        System.out.println(x);// 78
    }
}



