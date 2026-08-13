import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,8,6,7};
         int arr1[] = {3,4,5,6,8,6,7};

         int nums[] = {9,2,6,03,45,78,21,49,22,99};
         Arrays.sort(nums);
         System.out.println(Arrays.toString(nums));



         int num[] = new int[6];
         Arrays.fill(num, 10);
         System.out.println(Arrays.toString(num));


        // System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.equals(arr, arr1));
    }
    
}
