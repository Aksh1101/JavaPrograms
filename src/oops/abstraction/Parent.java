package oops.abstraction;

public abstract class Parent {

    int age;

    abstract void carrier (String name);
    abstract void partner(String name, int age);

    static void say() {
        System.out.println("Hello");
    }
}
