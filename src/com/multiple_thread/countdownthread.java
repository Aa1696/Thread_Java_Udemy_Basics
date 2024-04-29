package com.multiple_thread;

public class countdownthread extends Thread {
    private countdown threadcount;

    public countdownthread(countdown thrd) {
        this.threadcount = thrd;
    }

    @Override
    public void run() {
        threadcount.countdwn1();
    }
}
