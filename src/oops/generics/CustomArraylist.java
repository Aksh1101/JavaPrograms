package oops.generics;

import java.util.Arrays;

public class CustomArraylist {

    private int[] array;
    private static int Default_Size = 10;
    private int size = 0;

    public CustomArraylist() {
        this.array = new int[Default_Size];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        array[size++] = num;
    }

    private void resize() {
        int []temp = new int[array.length*2];
        // copy the current item in to the new array
        for (int i=0;i<array.length;i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    private boolean isFull() {
        return size == array.length;
    }
    public int remove(){
        int removed = array[--size];
        return removed;
    }
    public int get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int value){
        array[index] = value;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "CustomArraylist{" +
                "array=" + Arrays.toString(array) +
                ", size" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

    }
}
