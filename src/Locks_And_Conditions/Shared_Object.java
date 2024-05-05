package Locks_And_Conditions;

import java.util.concurrent.locks.ReentrantLock;

public class Shared_Object {
    boolean isAvailable = true;
    ReentrantLock lock = new ReentrantLock();
    public void producer(){
        try{
            lock.lock();
            System.out.println("Lock is acquired by ="+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch(Exception e){

        }finally{
            lock.unlock();
            System.out.println("Lock is released by ="+Thread.currentThread().getName());
        }
    }
}
