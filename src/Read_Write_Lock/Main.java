package Read_Write_Lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        Shared_Object obj = new Shared_Object();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(()->obj.producer(lock));
        Thread t2 = new Thread (()->{obj.consumer(lock);});
        Shared_Object obj1 = new Shared_Object();
        Thread t3 = new Thread(()->{obj.producer(lock);});
        t1.start();
        t2.start();
        t3.start();
    }
}
