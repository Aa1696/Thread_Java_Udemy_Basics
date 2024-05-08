package Stamped_Lock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock =  new StampedLock();
    public void produce(){
        long stamp = lock.readLock();
        try{
            System.out.println("Optimistic Lock is being acquire by:" + Thread.currentThread().getName());
            a =11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Update the value successfully");
            }
            else{
                System.out.println("Rollback of the value");
                a =10;
            }
        }
        catch(Exception e){

        }
    }
    public void consume(){
        long stamp = lock.writeLock();
        System.out.println("write Lock is being acquired by="+Thread.currentThread().getName());
        try{
            System.out.println("Executing the work");
            a = 9;
        }
        finally{
            lock.unlock(stamp);
            System.out.println("Write Lock is being released by ="+ Thread.currentThread().getName());
        }
    }
}
