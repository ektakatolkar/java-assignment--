class Payment extends Thread{
    public void run(){
        System.out.println("Processing payment...");
    }
}
class Order extends Thread{
    public void run(){
        System.out.println("Order confirmed...");
    }
}
public class Assignment39{
    public static void main(String[] args){
        Payment p=new Payment();
        Order o=new Order();
        p.start();
        o.start();
    }
}