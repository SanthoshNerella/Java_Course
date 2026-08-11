import java.util.Scanner;

public class TernaryOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Plzz tel your status To Votee : " + result);
        System.out.println((age >= 18) ? "Eligible" : "Not Eligible");
        sc.close();
    }
}
