package oops.generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenericArrayList<T> {
    // we can also limit the type by <T? extends Number> then it will allow int, float not string
    // this is java wildcard

    private Object[] array;
    private static int Default_Size = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.array = new Object[Default_Size];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        array[size++] = num;
    }

    private void resize() {
        Object []temp = new Object[array.length*2];
        // copy the current item in to the new array
        for (int i=0;i<array.length;i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    private boolean isFull() {
        return size == array.length;
    }
    public T remove(){
        T removed = (T)(array[--size]);
        return removed;
    }
    public T get(int index){
        return (T)array[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, T value){
        array[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "array=" + Arrays.toString(array) +
                ", size" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomArraylist list = new CustomArraylist();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);

        CustomGenericArrayList<Integer> list =  new CustomGenericArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

    }


}
