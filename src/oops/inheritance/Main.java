package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.length + " " + box.width + " " + box.height);
        // here it is using that constructor which have no parameters

        Box cube = new Box(5);
        System.out.println(cube.length + " " + cube.width + " " + cube.height);
        // here the constructor which is having the parameter side

        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.length + " " + box2.width + " " + box2.height + " " + box2.weight);
        // here the weight is coming from the constructor created in BoxWeight class which is also an extension of Box Class



    }
}
