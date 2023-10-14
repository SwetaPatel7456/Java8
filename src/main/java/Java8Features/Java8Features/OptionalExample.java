package Java8Features.Java8Features;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str =null;
//        if(str==null){
//            System.out.println("String is null");
//        }
//        else{
//            System.out.println(str.length());
//        }
        //above is the general way

        Optional<String> stringOptional = Optional.ofNullable(str);
        System.out.println(stringOptional.orElse("String is null"));
        Optional<String> name = getName();
        System.out.println(name.orElse("Name get from database is null"));

    }
    public static Optional<String> getName(){
        String name = "Sweta";
        return Optional.ofNullable(name);
    }
}
