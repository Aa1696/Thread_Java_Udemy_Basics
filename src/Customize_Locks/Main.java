package Customize_Locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        Shared_Object obj = new Shared_Object();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(()->{obj.produce(lock);});
        Thread t2 = new Thread(()->{obj.consume(lock);});

        Shared_Object obj1 = new Shared_Object();
        Thread t3 = new Thread(()->{obj1.produce(lock);});
        Thread t4 = new Thread(()->{obj1.consume(lock);});
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
