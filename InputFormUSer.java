import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFormUSer {
    public static void main(String[] args) throws IOException {


        // LAtest version to read inut form Keyboard from user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Your num is: "+ num);




//=------------------------------------------------------------------------------------------------------------>
              // BufferReader can take inuts for diff paths  ie.keyboard i/p , Files also


    //  InputStreamReader in = new InputStreamReader(System.in);
    //     BufferedReader br = new BufferedReader(in);
    //     int num = Integer.parseInt(br.readLine());
    //     System.out.println("Your num is : " + num );



//----------------------------------------------------------------------------------------->
        // int age = System.in.read();
        // // System.out.println(age);             --------------------> Problem: It takes one character at a time
        // System.out.println(age - 48);
//------------------------------------------------------------------------------------------>
    }
    
}
