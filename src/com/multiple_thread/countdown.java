package com.multiple_thread;
import static com.multiple_thread.ThreadColor.*;

public class countdown{
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
