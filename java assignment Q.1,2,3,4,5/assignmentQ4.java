import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room No: ");
        RNo = sc.nextInt();
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();
        System.out.print("Enter Days: ");
        Days = sc.nextInt();
    }

    void Compute() {
        Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = Amount + (Amount * 0.02f);
        }
    }

    void DispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.Compute();
        r.DispInfo();
    }
}