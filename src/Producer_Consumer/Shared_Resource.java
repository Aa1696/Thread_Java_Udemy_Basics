package Producer_Consumer;
import java.util.*;
import java.util.LinkedList;

public class Shared_Resource {
    private Queue<Integer>buffer;
    private int buffer_size;
    Shared_Resource(int val){
        this.buffer_size = val;
        this.buffer = new LinkedList<>();
    }
    public synchronized void Producer(int itm) throws InterruptedException {
        //buffer will produce till it is not full
        while(buffer_size==buffer.size()){
            System.out.println("Buffer is Full, please wait till it is getting empty!");
            wait();
        }
        System.out.println("Lock Acquired="+Thread.currentThread().getName());
        buffer.add(itm);
        Thread.sleep(8000);
        System.out.println("Lock released="+Thread.currentThread().getName());
        notify();
    }
    public synchronized int Consumer() throws InterruptedException {
        while(buffer.isEmpty()){
            System.out.println("Buffer is Empty");
            wait();
        }
        int itm = buffer.poll();
        notify();
        return itm;
    }

}
