package Semaphore;

public class Main {
    public static void main(String[] args) {
        Shared_Object obj = new Shared_Object();
        Thread t1 = new Thread(()->obj.produce());
        Thread t2 = new Thread(()->obj.produce());
        Thread t3 = new Thread(()->obj.produce());
        Thread t4 = new Thread(()->obj.produce());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
