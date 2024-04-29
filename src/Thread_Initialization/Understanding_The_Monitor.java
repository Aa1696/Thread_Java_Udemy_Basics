package Thread_Initialization;

public class Understanding_The_Monitor {
    public static void main(String[] args) {
        Monitor_Lock_Example obj1 = new Monitor_Lock_Example();
        Thread t1 = new Thread(()->obj1.task1());
        //System.out.println(t1.getName());
        Thread t2 = new Thread(()->obj1.task1());
        Thread t3 = new Thread(()->obj1.task1());
        //System.out.println(t3.getName());
        t1.start();
        ThreadGroup tg =t1.getThreadGroup();
        boolean flag = tg.isDaemon();
        System.out.println(flag);
        t2.start();
        t3.start();
    }
}
