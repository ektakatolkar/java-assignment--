import java.util.Scanner;
class EmailChecker {
    void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
public class Assignment22 {
    public static void main(String[] args) {
        EmailChecker obj = new EmailChecker();
        obj.checkEmail();
    }
}