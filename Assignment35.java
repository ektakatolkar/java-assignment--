class BankApplication{
    void process() throws Exception{
        throw new Exception();
    }
}
public class Assignment35{
    public static void main(String[] args){
        BankApplication obj=new BankApplication();
        try{
            obj.process();
            System.out.println("Transaction processed");
        }catch(Exception e){
            System.out.println("Exception handled in main");
        }
    }
}