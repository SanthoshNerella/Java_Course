import java.util.Scanner;

class Calculator {
    public void purpose(){
        System.out.println("The  purpose of the Clacualtor class is to initiate Calculator");
    }
    public int add(int num1 , int num2){
        System.out.println("The following operation is Addition");
        return num1 + num2;
    }
    public int sub(int num1 , int num2){
        return num1 - num2;
    }
    public int checking(int a , int b){
        return add(a,b);
    }
}




public class Demo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator cc = new Calculator();
        cc.purpose();
        int result = cc.add(a, b);
        System.out.println("the value after addto is: " + result);
        int ans = cc.sub(a, b);
        System.out.println(ans);
        int answer = cc.checking(a, b);
        System.out.println("Checking: " + answer);
        sc.close();

        
    }
    
}
