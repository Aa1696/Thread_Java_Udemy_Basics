package Stamped_Lock;

public class Main {
    public static void main(String[] args) {
        SharedResource object = new SharedResource();
        Thread t1 = new Thread(()->{
            object.produce();
        });
        Thread t2 = new Thread(()->{
            object.consume();
        });
        t1.start();
        t2.start();
    }
}
