package Java8Features.Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class FilterMalePerson {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John Doe", 25, "Male"),
                new Person("Jane Doe", 30, "Female"),
                new Person("Jim Doe", 40, "Male"),
                new Person("Jack Doe", 35, "Male"),
                new Person("Jill Doe", 28, "Female")
        );
        //peek operation does not modify the elemnts of stream you can use to perform opertion on intermediate result.

//        List<Person> filteredEmployee = persons.stream().filter(person ->person.getGender().equalsIgnoreCase("Male"))
//                .peek(person->person.setAge(person.getAge()+5)).collect(Collectors.toList());
        //persons.forEach(System.out::println);

        //filteredEmployee.forEach(System.out::println);
        List<Person> listOf3OldPerson = persons.stream().sorted(new Comparator<Person>(){

            @Override
            public int compare(Person e1 ,Person e2){
                int ageCompare = e2.getAge() - e1.getAge();

                return (ageCompare==0)?e1.getName().compareTo(e2.getName()):ageCompare;
            }
        }).limit(3).collect(Collectors.toList());
        listOf3OldPerson.forEach(System.out::println);
//        List<Person> filteredEmployee = persons.stream().filter(person ->person.getGender().equalsIgnoreCase("Male")).
//                map(person -> {
//                    person.setAge(person.getAge()+5);
//                    return person;
//                }).collect(Collectors.toList());
//        //Group Persons by their age
//        Map<String, List<Person>> groupBYGender = persons.stream().collect(Collectors.groupingBy(Person::getGender));
//        //Group Person first By their age and then gender
//        Map<Integer,Map<String,List<Person>>> res = persons.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.groupingBy(Person::getGender)));
//
//        //group by department along with summation of salary;
//        //groupByGenderwithsumOfAges
//        Map<String, Integer> map = persons.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.summingInt(Person::getAge)));
        List<String> list5 = new ArrayList<>();
        list5.add("sweta");
        list5.add("eva");
        //filter string star with e
        list5.stream().filter(s->s.startsWith("e")).count();
        list5.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        //concatenate strings
        String concatenatedString =  list5.stream().collect(Collectors.joining());
        System.out.println(concatenatedString);
        List<Integer> list = List.of(1, 2, 3, 3, 3, 4, 4);
        list.stream().mapToDouble(n->n).average().getAsDouble();
        int max = list.stream().sorted((a, b) -> b - a).limit(1).collect(Collectors.toList()).get(0);
        //another way to max value
        int max1=  list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max " +max1);
        //program to remove duplicate elemnts from list
        list.stream().distinct().forEach(System.out::println);
        //sort person based on their ages
        //persons.stream().sorted(Comparator.comparing(Person::getAge))
        //Collections.sort(persons,Comparator.comparing(Persons::getSalary);
        //check all the values in list satisfy given conditions or not
        boolean result = list.stream().allMatch(x->x%2==0);
        List<Person> list1 = new ArrayList<>();
        list1.stream().filter(p-> p.getName().contains("it")).filter(p->p.getAge()>40).filter(p->!p.getDepartment().equals("finance"))
                .sorted((p1,p2)->  p1.getAge()- p2.getAge()).collect(Collectors.toList());
       // Map<String,List<Person>> map = list1.stream().collect(Collectors.groupingBy(Person::getDepartment));
//        Map<String,Person> map1 = new HashMap<>();
//
//        for (Map.Entry<String,List<Person>>entry :map.entrySet()){
//            List<Person> sortedByAge = entry.getValue().stream().sorted((p5,p6)-> { return p6.getAge()- p5.getAge();}).collect(Collectors.toList());
//            if (sortedByAge.size()>=2){
//                map1.put("depe",sortedByAge.get(1));
//            }
//        }







    }
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
       long prod[] = new long[n];
       long left [] = new long[n];
        long right[] = new long[n];
        left[0]= 1;
        right[n-1] = 1;
       for(int i =0;i<n;i++){
           prod[i] =1;
       }

       long temp = 1;
       for(int i =0;i<n;i++){
           left[i] = temp;
           temp= temp * nums[i];
       }
       temp =1 ;
       for(int i =n-1;i>=0;i--){
           right[i] = temp;
           temp = temp * nums[i];
       }
       for(int i =0;i<n;i++){
           prod[i] = left[i]* right[i];
       }
       return prod;


    }




}
