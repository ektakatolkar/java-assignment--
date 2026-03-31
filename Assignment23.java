import java.util.Scanner;
class StudentNameComparison{
    void compareNames(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String name1=sc.nextLine();
        System.out.print("Enter second name: ");
        String name2=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("Names are same (case-sensitive)");
        }else{
            System.out.println("Names are different (case-sensitive)");
        }
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Names are same (case-insensitive)");
        }else{
            System.out.println("Names are different (case-insensitive)");
        }
    }
}
public class Assignment23{
    public static void main(String[] args){
        StudentNameComparison obj=new StudentNameComparison();
        obj.compareNames();
    }
}