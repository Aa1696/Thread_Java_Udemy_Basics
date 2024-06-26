package Thread_Initialization;

public class Thread_Learning  extends Thread{
    /*
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */

    @Override
    public void run() {
        System.out.println("Code executed by the thread:"+Thread.currentThread().getName());
    }
}
