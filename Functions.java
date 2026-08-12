import java.util.Scanner;

public class Functions {



    static boolean isEven(int n){
        return n % 2 == 0;
    }
    static boolean eligibilityToVote(int n){
        return n >= 18;
    }
    static int add(int a , int b){
        return a + b ;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check isEven or not: ");
        int num = sc.nextInt();
        boolean res = isEven(num);
        System.out.println(res);
        System.out.println("enter the numbers for addition: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = add(num1,num2);
        System.out.println("Value after addition:" + ans);
        System.out.print("Enter Age of voter: ");
        int age = sc.nextInt();
        boolean status = eligibilityToVote(age);
        System.out.println("Whether voter elegible to vote: " + status);
        sc.close();

    }
    
}
