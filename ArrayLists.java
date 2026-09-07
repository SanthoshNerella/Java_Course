import java.util.*;

public class ArrayLists {

public static void main(String[] args) {

    // Collection <Integer> nums = new ArrayList<>();
    // nums.add(5);
    // nums.add(6);
    // nums.add(23);
    // nums.add(2);
    // nums.add(1);
    // // nums.add(null);
    // // nums.add(null);
    // // nums.add(null);
    // nums.add(5);

    // // nums.add("Santhosh Nerella");

    // System.out.println(nums);

    // // for(int num : nums){
    // //     System.out.print(num + " ");
    // // }

    // for(Object num : nums){
    //     int n = (int) num ;
    //     System.out.println(n);
    // }

    // Iterator<Integer> num =  nums.iterator();
    // while(num.hasNext()){
    //     System.out.println(num.next());

    // }
    //---------------------------------------------------------------------------------------------------------------------------------->
    //                                List methods
    List <Integer> nums = new ArrayList<Integer>();
    System.out.println(nums.isEmpty());
    System.out.println(nums);
    // nums.add(null);
    // System.out.println(nums.isEmpty());
    // System.out.println(nums);

    nums.add(8);
    nums.add(3);
    nums.add(3);
    nums.add(2);
    nums.add(1);
    nums.add(0);
    System.out.println(nums);

    nums.add(1,20);
    nums.set(0,20);
    System.out.println(nums.contains(5));
     System.out.println(nums.size());
    System.out.println(nums.remove(2));
    System.out.println(nums.size());

    Iterator<Integer> num = nums.iterator();
    while(num.hasNext()){
        System.out.print(num.next() + " ");
    }

    
}
    
}
