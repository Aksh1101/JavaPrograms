package oops.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // gives the number representation of an object
    // hashCode basically a unique representation of a object by a number
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    } // gives the string representation

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    } called when garbage collection hits


    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
