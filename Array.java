public class Array {
    public static void main(String[] args) {

       // int nums[] = new int[5];

        // for(int i = 0 ; i <nums.length ; i++){
        //     System.out.println(nums[i]);
        // }
        // nums[0] = 1;
        //  nums[1] = 10;
        //   nums[2] = 111;
        //    nums[3] = 101;
        //     nums[4] = 108;
        // for(int n :nums){
        //     System.out.println(n);
        // 
        
        // int nums[] = {2,5,3,6,3,8,9};
        // System.out.println("Size of Array is: " + nums.length);
        // nums[4] = 99;
        // for(int n : nums)
        //     System.out.print(n + " ");

        int nums [] = new int[5];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (int) (Math.random() * 100);
        }
        for(int n : nums){
            System.out.print(n + " ");
        }  
    }
}
    
