import java.util.*;

public class OptinalClass {

    public static void main(String[] args) {

                  //   one way
    //     List<String> names = Arrays.asList("Santhosh", "Surya","Manoj", "Pranay", "Sanjaay", "Vishwesh", "Vardhan" , "Shiva");

    //    Optional <String> name = names.stream()   
    //                   .filter(str -> str.contains("x"))
    //                   .findFirst();
       
    //     System.out.println(name.orElse("Not Found"));

                // Second Way
                

           List<String> names = Arrays.asList("Santhosh", "Surya","Manoj", "Pranay", "Sanjaay", "Vishwesh", "Vardhan" , "Shiva");
               String name = names.stream()   
                      .filter(str -> str.contains("ay"))
                      .findFirst()
                      .orElse("Not Found");

       System.out.println(name);

    }
    
}
