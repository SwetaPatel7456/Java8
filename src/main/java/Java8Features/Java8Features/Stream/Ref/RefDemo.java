package Java8Features.Java8Features.Stream.Ref;

public class RefDemo {
    public static void main(String[] args) {

//        StuffInterface stuffInterface = ()->{
//            System.out.println("I am learning method reference");
//        };
      //  stuffInterface.stuffInterfaceMethod()
        //in above implementation we are using lambda expression  but did u noticed we are implemetaing same method which is present in Stuff class
        //so we can use method Reference  it woud be done in single line;


        StuffInterface stuffInterface = Stuff::doStuff;
        //but argument of the referreing method must be same as functional interface
        stuffInterface.stuffInterfaceMethod();

        Runnable r1 = Stuff::threadTask;
        Thread t = new Thread(r1);
        t.start();

        Stuff stuff = new Stuff();
        Runnable r2 = stuff::doStuffForNonStaticMethod;
        Thread t1 = new Thread(r2);
        t1.start();



    }

}
