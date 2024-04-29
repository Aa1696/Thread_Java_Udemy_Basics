import Thread_Initialization.Thread_Learning;
import com.multiple_thread.countdown;
import com.multiple_thread.countdownthread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Thread:"+Thread.currentThread().getName());
        Thread_Learning thread1 = new Thread_Learning();
        thread1.start();
        System.out.println("Finished Main Method ="+Thread.currentThread().getName());
    }
}
