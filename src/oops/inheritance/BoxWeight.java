package oops.inheritance;

public class BoxWeight extends Box {
    // by this extends keyword we can have all the properties of Box class along with its own properties
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }


    // this super keyword is used to call the parent class constructor
    // used to initialise values present in parent class


}
