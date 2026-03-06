package oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            divide(a, b);
        }
        catch (ArithmeticException e) { // this only for arithmetic exceptions
            System.out.println(e.getMessage());
        }catch (Exception e){ // this can catch all the exception
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute, no matter what ");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {

        if(b==0){
            throw new  ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
