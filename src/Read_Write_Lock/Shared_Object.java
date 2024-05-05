package Read_Write_Lock;

import java.util.concurrent.locks.ReadWriteLock;

public class Shared_Object {
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Producer Lock is Acquired by "+ Thread.currentThread().getName());
            Thread.sleep(6000);
        }
        catch(Exception e){

        }
        finally{
            lock.readLock().unlock();
            System.out.println("Producer Lock is release by "+ Thread.currentThread().getName());
        }
    }
    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Consumer Lock is Acquired by "+ Thread.currentThread().getName());
            Thread.sleep(4000);
        }
        catch(Exception e){

        }
        finally {
            lock.writeLock().unlock();
            System.out.println(" Consumer Lock is Released by "+Thread.currentThread().getName());
        }
    }
}
