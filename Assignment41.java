class Restaurant{
    boolean ready=false;
    synchronized void prepare() throws Exception{
        System.out.println("Chef prepared food");
        ready=true;
        notify();
    }
    synchronized void serve() throws Exception{
        if(!ready){
            wait();
        }
        System.out.println("Waiter served food");
    }
}
public class Assignment41{
    public static void main(String[] args){
        Restaurant r=new Restaurant();
        Thread chef=new Thread(()->{
            try{r.prepare();}catch(Exception e){}
        });
        Thread waiter=new Thread(()->{
            try{r.serve();}catch(Exception e){}
        });
        waiter.start();
        chef.start();
    }
}