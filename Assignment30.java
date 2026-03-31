import java.util.Scanner;
class PasswordMaskingSystem{
    void maskPassword(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass=sc.nextLine();
        String masked=pass.substring(pass.length()-2);
        String stars=pass.substring(0,pass.length()-2).replaceAll(".", "*");
        System.out.println("Masked Password: "+stars+masked);
    }
}
public class Assignment30{
    public static void main(String[] args){
        PasswordMaskingSystem obj=new PasswordMaskingSystem();
        obj.maskPassword();
    }
}