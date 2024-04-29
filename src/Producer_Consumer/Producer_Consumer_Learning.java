package Producer_Consumer;

public class Producer_Consumer_Learning {
    public static void main(String[] args) {
        System.out.println("Main thread started working");
        Shared_Resource prdc = new Shared_Resource(5);
        Thread t1 = new Thread(()->{
            System.out.println("Thread1 will acquire the lock="+Thread.currentThread().getName());
            try{
                prdc.Producer(5);
            }
            catch(Exception e) {

            }
        });
        Thread t2 = new Thread(()->{
            try{
                System.out.println("Thread =" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
            System.out.println("Thread2 want to capture="+Thread.currentThread().getName());
            try{
                prdc.Producer(6);
            }
            catch(Exception e){

            }
        });
        t1.start();
        t2.start();
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
        }
        try{
            t1.suspend();
        }catch(Exception e){
        }
        t1.resume();
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread finished the work="+Thread.currentThread().getName() );
    }
}
