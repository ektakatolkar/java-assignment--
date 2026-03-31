class BankingSystem{
    int balance=1000;
    void withdraw(int amount){
        synchronized(this){
            balance=balance-amount;
            System.out.println("Remaining balance: "+balance);
        }
    }
}
public class Assignment42{
    public static void main(String[] args){
        BankingSystem obj=new BankingSystem();
        Thread t1=new Thread(()->obj.withdraw(200));
        Thread t2=new Thread(()->obj.withdraw(300));
        t1.start();
        t2.start();
    }
}
