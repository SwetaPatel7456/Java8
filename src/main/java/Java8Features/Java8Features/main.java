package Java8Features.Java8Features;

import java.awt.image.ImageProducer;
import java.util.*;

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

        for (Product p4: list){
            System.out.println(p4.getId());
        }
        Collections.sort(list,(o1,o2)->{
            return o1.compareTo(o2);
        });


    }

}
