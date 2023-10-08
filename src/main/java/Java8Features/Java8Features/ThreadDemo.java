package Java8Features.Java8Features;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r1 = ()->{

            for(int i =0;i<4;i++){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        r1.run();
        r2.run();


    }
    static Runnable r2 = new Runnable() {
        @Override
        public void run() {
            for(int i =0;i<4;i++){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };


}
