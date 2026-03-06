package oops.staticExample;

// this is a demo to show initialisation of static variable
public class StaticBlock {
    static int  a = 6;
    static int b;

    // will only runs once, when the first object is created
    // i.e when the class is loaded for the first time
    static {
        System.out.println("Static Block");
        b =  a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
