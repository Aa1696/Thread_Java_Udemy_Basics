package Locks_And_Conditions;

public class Main {
    public static void main(String[] args) {
        Shared_Object obj = new Shared_Object();
        System.out.println("Current Thread ="+Thread.currentThread().getName());
        Thread t1 = new Thread(()->{
            obj.producer();
        });

        Thread t2 = new Thread(()->{
            obj.producer();
        });
        t1.start();
        t2.start();
    }
}
