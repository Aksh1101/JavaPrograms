package oops.access;

import java.lang.reflect.Array;

public class A {
    private int num;
    String name; // these all three are data members
    int[] arr;

    public int getNum() { // this is a getter(getter gets the value)
        return num;
    }

    public void setNum(int num) { // this is a setter (setter sets the value)
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
