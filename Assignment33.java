import java.util.InputMismatchException;
import java.util.Scanner;
class StudentInputSystem{
    void getAge(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter age: ");
            int age=sc.nextInt();
            if(age<=0){
                throw new ArithmeticException();
            }
            System.out.println("Student age is: "+age);
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }catch(ArithmeticException e){
            System.out.println("Invalid input");
        }
    }
}
public class Assignment33{
    public static void main(String[] args){
        StudentInputSystem obj=new StudentInputSystem();
        obj.getAge();
    }
}