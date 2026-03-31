import java.util.Scanner;
class ATMWithdrawal{
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter balance: ");
        int balance=sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int amount=sc.nextInt();
        try{
            if(amount>balance){
                throw new Exception();
            }else{
                balance=balance-amount;
                System.out.println("Withdrawal successful. Remaining balance: "+balance);
            }
        }catch(Exception e){
            System.out.println("Insufficient Balance");
        }
    }
}
public class Assignment31{
    public static void main(String[] args){
        ATMWithdrawal obj=new ATMWithdrawal();
        obj.withdraw();
    }
}