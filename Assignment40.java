class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" running");
    }
}
public class Assignment40{
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}