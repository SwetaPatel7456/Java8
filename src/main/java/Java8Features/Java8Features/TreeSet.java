package Java8Features.Java8Features;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSet {

    public static void main(String[] args) {

        Set<Integer> set = new java.util.TreeSet<>();
        set.add(22);
        set.add(1);
        set.add(33);
        System.out.println("Before manual sorting");
        set.stream().forEach(System.out::println);

        Set<Integer> set1 = new java.util.TreeSet<>((a,b)->b-a);
        set1.add(22);
        set1.add(1);
        set1.add(33);
        System.out.println("After sorting");
        set1.stream().forEach(System.out::println);

        //sort Tree Map
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(3,"b");
        map.put(2,"c");
        System.out.println("Before manual sorting " + map);
        Map<Integer,String> map1 = new TreeMap<>((a,b)->b-a);
        map1.put(1,"a");
        map1.put(3,"b");
        map1.put(2,"c");
        System.out.println("After manual sorting " + map1);




    }
}
