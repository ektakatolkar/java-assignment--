import java.util.Scanner;
class UsernameValidator {
    String username;
    void getUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = sc.nextLine();
        username = username.trim();
        username = username.toLowerCase();
        System.out.println("Cleaned Username: " + username);
    }
}
public class Assignment21 {
    public static void main(String[] args) {
        UsernameValidator obj = new UsernameValidator();
        obj.getUsername();
       
    }
}