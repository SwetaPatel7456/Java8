package Java8Features.Java8Features;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
//        System.out.println("My system starts");
//        MyInter myInter = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("sayHello");
//            }
//        };
//        myInter.sayHello();
//        //using lambda expression
//        MyInter i1 = ()->{System.out.println("Implemented functinal interface one method using lambda expression ");};
         //i1.sayHello();
         Product p1 = new Product();
         p1.setId("1");
         p1.setName("Zebra");
        Product p2 = new Product();
        p2.setId("2");
        p2.setName("Banana");
        Product p3 = new Product();
        p3.setId("3");
        p3.setName("Orange");

        List<Product> list  = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Product p4: list){
            System.out.println(p4.getId());
        }
        Collections.sort(list);
        System.out.println("After sorting on the basis of ID");
        for (Product p4: list){
            System.out.println(p4.getId());
        }
        System.out.println("After sorting on the basis of Product Name");
        Collections.sort(list,new ProductNameComparator());
        Collections.sort(list,(p0,p01)->
             p0.getName().compareTo(p01.getName())
        );

        for (Product p4: list){
            System.out.println(p4.getId());
        }
        Collections.sort(list,(o1,o2)->{
            return o1.getId().compareTo(o2.getId());
        });
        List<Person> list5 = Arrays.asList(
                new Person("John Doe", 25, "Male"),
                new Person("Jane Doe", 30, "Female"),
                new Person("Jim Doe", 40, "Male"),
                new Person("Jack Doe", 35, "Male"),
                new Person("Jill Doe", 35, "Female")
        );
        list5.stream().sorted(
                (p9,p10)-> {return p9.getAge()-p10.getAge();}).collect(Collectors.toList());
        list5.stream().filter(p7->p7.getAge()>10).count();
        Map<Integer, Map<String, List<Person>>> personGroupedByAgeAndThenGender = list5.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.groupingBy(Person::getGender)));
        System.out.println("personGroupedByAgeAndThenGender " +personGroupedByAgeAndThenGender);
        Consumer<Integer> consumer = a->{
            System.out.println(a);
        };
        consumer.accept(10);
        Consumer<List<Integer>> consumer1 = (list3)->{
            for(int i =0;i<list3.size();i++){
                System.out.println(list3.get(i));
            }
        };
        List<Integer> list2 = List.of(1,2,3,4,5);
        consumer1.accept(list2);

        Supplier<Double> supplier = ()->Math.random();

        System.out.println(supplier.get());


    }

}
