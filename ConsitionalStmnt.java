import java.util.*;
public class ConsitionalStmnt {

    static void greatest(int a , int b , int c){
        if(a > b && a >c){
            System.out.println(" A is greatest aong three");
        }else if( b > c){
            System.out.println("B is greatest among three numers");
        }else{
            System.out.println(" c is gratest maong three numbers");
        }
    }
    public static void main(String[] args) {
        
    //   int a = 10;
    //   int b = 17;
    //   int c = 21;
    //   if(a > b && a > c){
    //     System.out.println("A is greatest of three noumbers");
    //   } else if (b > c){
    //     System.out.println("B s gratest among three numbers");
    //   }else{
    //     System.out.println(" C is greatest among three numebers");
    //   }

     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     greatest(a, b, c);
    sc.close();
    }
    
}
