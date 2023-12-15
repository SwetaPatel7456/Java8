public class OddThread implements Runnable{



    @Override
    public void run() {


        for(int i =1;i<=100;i++){
            if(i%2!=0){
                System.out.println("ThreadName " +Thread.currentThread().getName() + " " +i);
            }
        }
    }
}
