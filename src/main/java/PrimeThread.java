public class PrimeThread implements Runnable{



    @Override
    public void run() {
        boolean flag = false;
        for(int i =2;i<=100;i++){
            int j = 2;
            while ( j<i){
                if(i%j==0 && j!=i){
                    flag = true;
                }
                j++;
            }
            if(flag==false){
                System.out.println("ThreadName " +Thread.currentThread().getName() + " " +i);
            }
            if(flag==true){
                flag = false;
            }

        }
    }
}
