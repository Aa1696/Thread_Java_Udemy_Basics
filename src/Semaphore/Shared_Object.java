package Semaphore;

import java.util.concurrent.Semaphore;

public class Shared_Object {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);
    int cnt =0;
    public void produce(){
        try{
            lock.acquire();
            System.out.println("Lock is being acquired by ="+ Thread.currentThread().getName()+"count="+ ++cnt);
            isAvailable = true;
            Thread.sleep(4000);
        }
        catch(Exception e){

        }
        finally {
            lock.release();
            cnt--;
            System.out.println("Get Count="+cnt);
            System.out.println("Lock is being released by="+ Thread.currentThread().getName());
        }
    }
}
