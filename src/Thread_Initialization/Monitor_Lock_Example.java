package Thread_Initialization;

public class Monitor_Lock_Example {
    public synchronized void task1(){
        try{
            System.out.println("inside task");
            Thread.sleep(10000);
        }
        catch(Exception e){

        }
        System.out.println("Working to understand the task1");
    }
    public void task2(){
        System.out.println("Working in task2 without ");
        synchronized (this){
            try{
                Thread.sleep(19999);
                System.out.println("Working to understand the task2");
            }catch(Exception e){

            }

        }
    }
    public void task3(){
        System.out.println("Working to understand task3");
    }
}
