package oops.collections;

import java.rmi.MarshalledObject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();


        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();


        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();
    }
}
