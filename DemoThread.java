class collegeThread extends Thread{
    private boolean running=true;

    public void stopThread(){
        running=false;
    }
    public void run(){
        try{
        while(running){
            System.out.println("BMS college of engineering.");
            Thread.sleep(10000);
        }
    }
    catch(InterruptedException e){
        System.out.println("College thread Interrupted.");
    }
  }
}
class CSEThread extends Thread{
    private boolean running=true;

    public void stopThread(){
        running=false;
    }
    public void run(){
        try{
            while(running){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Cse thread interrupted");
        }
    }
}
public class DemoThread{
    public static void main(String args[]){
        collegeThread t1=new collegeThread();
        CSEThread t2=new CSEThread();
        t1.start();
        t2.start();
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException e){

        }
        t1.stopThread();
        t2.stopThread();
        System.out.println("Threads Stopped");
    }
}
