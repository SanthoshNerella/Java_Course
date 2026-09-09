import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

     List<String> names = Arrays.asList("Santhosh" , "Surya Kumar" , "Teja", "Hello");


    //  List<String> Uname = names.stream()
    //                .map(str -> str.toUpperCase())
    //                .toList();

    // System.out.println(Uname);



    List<String> Uname = names.stream()
                   .map(String::toUpperCase)            // Metho Refernce
                   .toList();
    System.out.println(Uname);


    }
    
}
