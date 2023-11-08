package thread;
class MyThread extends Thread {
    public void run(){

    }
}
public class Main {
    public static void  main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();   
    }
}
