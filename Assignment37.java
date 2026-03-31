class DownloadTask implements Runnable{
    public void run(){
        System.out.println("Downloading file...");
    }
}
public class Assignment37{
    public static void main(String[] args){
        Thread t1=new Thread(new DownloadTask());
        Thread t2=new Thread(new DownloadTask());
        t1.start();
        t2.start();
    }
}