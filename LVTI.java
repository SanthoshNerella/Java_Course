import java.util.*;


// class var {            --------------------> var cannot be used a name for class

// }


public class LVTI {

    // var n2 = 0;  ------------------> var is alloed to declare at instance level

    public static void main(String[] args) {


        int num = 9 ;
        // var n1;                  // cannot use var ithout intializing and assiging value
        var n1 = 3 ;

        String var = "Santhosh Nerella";             // var can be used as a varibale name ie.it is not a reseerved key word

        // int arr[] = new int[12];

        var arr = new int[9];                         // when arra declared with var e cannnot use [] 

        // List<Integer> nums = Arrays.asList(3,4,5,1,0,9,6,7);  
          var nums = Arrays.asList(3,4,5,1,0,9,6,7);                // var can be used ofr short cut for longerNames
        System.out.println(nums);


    }

    
}
