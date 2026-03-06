package oops.inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }



    public BoxPrice(double width, double height, double length, double weight, double cost) {
        super(width, height, length, weight);
        this.cost = cost;
    }
}
