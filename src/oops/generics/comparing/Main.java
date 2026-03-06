package oops.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student Max = new Student(30, 87.90f);
        Student Jorge = new Student(23, 27.99f);

        if (Max.compareTo(Jorge)< 0){
            System.out.println(Jorge.compareTo(Max));
            System.out.println("Jorge has more marks");
        }
        else  {
            System.out.println(Jorge.compareTo(Max));
            System.out.println("Max has more marks");
        }
    }
}
