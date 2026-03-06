package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Parent.say();
        Son son = new Son(30);
        son.carrier("Racer");
        son.partner("Milli", 29);
    }
}
