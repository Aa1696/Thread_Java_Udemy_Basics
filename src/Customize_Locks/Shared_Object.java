package Customize_Locks;

import java.util.concurrent.locks.ReadWriteLock;

public class Shared_Object {
    boolean isAvailable = false;
    public void produce(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Lock is Acquired:"+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
        finally{
            lock.readLock().unlock();
            System.out.println("Lock Has been released by:"+ Thread.currentThread().getName());
        }
    }
    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Lock has been acquired to write by:"+Thread.currentThread().getName());
            //Thread.sleep(2000);
        }
        catch(Exception e){

        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Lock has been released by:"+Thread.currentThread().getName());
        }
    }
}
