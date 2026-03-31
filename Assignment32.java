import java.util.Scanner;
class DivisionCalculator{
    void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
public class Assignment32{
    public static void main(String[] args){
        DivisionCalculator obj=new DivisionCalculator();
        obj.divide();
    }
}