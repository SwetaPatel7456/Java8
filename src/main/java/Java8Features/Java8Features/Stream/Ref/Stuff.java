package Java8Features.Java8Features.Stream.Ref;

public class Stuff {

    public static void doStuff(){
        System.out.println("I am learning method reference");
    }

    public  void doStuffForNonStaticMethod(){
        System.out.println("I am learning method reference");
    }

    public static void  threadTask()  {
        for(int i =0;i<3;i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
