package recusion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,34,56,56,67,67,88,88};
        System.out.println(search(arr,56,0));
        System.out.println(findIndex(arr,56,0));
        System.out.println(findIndexLast(arr,56,arr.length-1));
        findAllIndex(arr,56,0);
        System.out.println(list);
        ArrayList<Integer>  list1 = new ArrayList<>();
        System.out.println(findAllIndexes(arr,67,0,list1));
        // another way
        System.out.println(findAllIndexes(arr,56,0,new ArrayList<>()));
        System.out.println(findAllIndexes1(arr,88,0));


    }
    static boolean search(int[] arr,int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }
    // function which return the index
    static int findIndex(int[] arr,int target , int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
    // searching from last
    static int findIndexLast(int[] arr,int target , int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndexLast(arr,target,index-1);
        }
    }
    // here we're going to find all the index and add it in an arraylist
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target , int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    // here we want to don't want to create an arraylist like above
    // here is my return type is arraylist
    // here we habe taken it in arguments
    static ArrayList<Integer> findAllIndexes(int[] arr,int target , int index, ArrayList<Integer> list1){
        if (index == arr.length){
            return list1;
        }
        if (arr[index] == target){
            list1.add(index);
        }
        return findAllIndexes(arr,target,index+1,list1);
    }
    //here we are not passing it in the arguments
    // not a good approach to use
    static ArrayList<Integer> findAllIndexes1(int[] arr,int target , int index){
        ArrayList<Integer> list2 = new ArrayList<>();
        if (index == arr.length){
            return list2;
        }
        // this will contain the answer for that function call only

        if (arr[index] == target){
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCall =  findAllIndexes1(arr,target,index+1);

        list2.addAll(ansFromBelowCall);
        return list2;
    }
}

