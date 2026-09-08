import java.util.*;

public class ComparatorPractise {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,2,7,1,9,2,6,7,1);
        //            without using lamda expression

        // Comparator<Integer> own = new Comparator<Integer>() {
        //     public int compare(Integer i , Integer j){
        //         if(i > j) {
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
            
        // };

                  //     Using lamda Expression

           Comparator<Integer> own =  (i, j) -> {
              
                 return (i > j) ? 1 : -1 ;
                // if(i > j)  return 1;
                // else {
                //     return -1;
                // }

            };



        Collections.sort(nums, own);

        // nums.forEach(n -> System.out.print(n));
        System.out.println(nums);

        
    }
    
}
