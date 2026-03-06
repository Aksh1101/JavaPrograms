package oops.polymorphism;

public class Circle extends Shapes {

    // this will run when obj of circle is created
    // hence it will override the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pi*r*r ");
    }
}
