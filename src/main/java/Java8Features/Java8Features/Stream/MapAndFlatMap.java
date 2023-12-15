package Java8Features.Java8Features.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {
     //map() method used for transformation
    //flatMap() method used for transformation and flattering
    //both these methods are intermediate methods and return another stream() as part of output
    //map produces one value for each input value
    //flat map operation produces an arbitrary number for each input value;

    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1,2,3,4,5);
//        List<Integer> ans = numbers.stream().map(i-> i*i).collect(Collectors.toList());
//        System.out.println(ans);
//        List<List<Integer> > number = new ArrayList<>();
//
//        // adding the elements to number arraylist
//        number.add(Arrays.asList(1, 2));
//        number.add(Arrays.asList(3, 4));
//        number.add(Arrays.asList(5, 6));
//        number.add(Arrays.asList(7, 8));
//
//        System.out.println("List of list-" + number);
//
//        List<Integer> list = number.stream().flatMap(l-> l.stream()).collect(Collectors.toList());
//       // List<Integer> list = number.stream().map(l-> l.stream()).collect(Collectors.toList());
//        List<Stream<Integer>>list1 = number.stream().map(l-> l.stream()).collect(Collectors.toList());
//
//        for(Stream<Integer> stream :list1){
//            System.out.println(stream.collect(Collectors.toList()));
//        }
        System.out.println(maxLengthSubstringWithNonRepeatingCharacter());

       // System.out.println(list);
    }
    public static String maxLengthSubstringWithNonRepeatingCharacter(){

        int i =0;
        int j =0;
        String s = "acdcegghj";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        int length = s.length();
        int start =-1;
        int end =-1;
        int max = Integer.MIN_VALUE;

        while (i<length){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            else{
                if(max< i-j){
                    max = i-j;
                    start =j;
                    end=i;
                }
                j = map.get(s.charAt(i));
                map.put(s.charAt(i),i);
                }
            i++;
        }
        if(start==-1){
            return s;
        }
        return s.substring(start,end);
    }
    static int longestSubstrDistinctChars(String S){
        // code here

        int i =0;
        int j =0;
        String s = "acdcegghj";
        int length = s.length();
        int max = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();

        while (i<length){

            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
               while (j<i && set.contains(s.charAt(i))){
                   set.remove(s.charAt(j));
                   j++;
               }
               set.add(s.charAt(i));
            }
            if(max <i-j+1){
                max = i-j+1;
            }
            i++;
        }

        return max;

    }



}
