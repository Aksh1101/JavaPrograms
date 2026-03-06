package oops.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    // creating a cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double width, double height ,double length){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }
}
