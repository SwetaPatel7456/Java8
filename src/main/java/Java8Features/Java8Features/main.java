package Java8Features.Java8Features;

public class main {
    public static void main(String[] args) {
        System.out.println("My system starts");
        MyInter myInter = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("sayHello");
            }
        };
        myInter.sayHello();
        //using lambda expression
        MyInter i1 = ()->{System.out.println("Implemented functinal interface one method using lambda expression ");};
         i1.sayHello();
    }
}
