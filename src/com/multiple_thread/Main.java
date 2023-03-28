package com.multiple_thread;
import static com.multiple_thread.ThreadColor.*;
public class Main {
    public static void main(String[] args) {
        countdown ct1=new countdown();
        countdown ct2=new countdown();
        countdownthread t1=new countdownthread(ct1);
        t1.setName("Thread 1");
        //t1.wait(1000);
        countdownthread t2=new countdownthread(ct2);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
class countdown{
    public void countdwn1(){
        String color;
        switch(Thread.currentThread().getName()){
            case "Thread 1":
                color= ANSI_RED;
                break;
            case "Thread 2":
                color=ANSI_CYAN;
                break;
            default:
                color= ThreadColor.ANSI_GREEN;
        }
        synchronized (color){
            for(int i=10;i>=0;i--){
                System.out.println(color + Thread.currentThread().getName() + ":"+i);
            }
        }

    }
}
class countdownthread extends Thread{
    private countdown threadcount;
    countdownthread(countdown thrd){
        this.threadcount=thrd;
    }

    @Override
    public void run() {
        threadcount.countdwn1();
    }
}