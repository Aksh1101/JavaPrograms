package oops.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human John = new Human(12, "John");
        //Human twin = new Human(John);
        Human Twin = (Human)John.clone();
        System.out.println(Twin.age + "  " + Twin.name);
    }
}
