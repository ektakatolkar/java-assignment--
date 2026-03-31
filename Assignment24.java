import java.util.Scanner;
class MessageFormatter{
    void formatName(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first=sc.nextLine();
        System.out.print("Enter last name: ");
        String last=sc.nextLine();
        String fullName=first+" "+last;
        System.out.println("Full Name: "+fullName);
    }
}
public class Assignment24{
    public static void main(String[] args){
        MessageFormatter obj=new MessageFormatter();
        obj.formatName();
    }
}
