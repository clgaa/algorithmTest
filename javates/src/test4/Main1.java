package test4;

public class Main1 {
    public static volatile Sub sub;
    public static volatile int num;
    public static void main(String[] args) {
        Thread[] thread = new Thread[20];
        for(int i = 0; i < 20; i++){
            thread[i] = new Thread(new Runnable() {
                
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    for(int j = 0; j < 10000; j++) {
                        num++;
                    }
                }
            });
            thread[i].start();
        }
        while(Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(num);
        
    }
}
