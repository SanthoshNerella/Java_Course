import java.util.*;

public class ParallelStream {

    public static void main(String[] args) {
        Random rm = new Random();
        int size = 250;
        List<Integer> nums = new ArrayList<>(size);
        for(int i = 1 ; i < size ; i++){
            nums.add(rm.nextInt(100));
        }
            long strt_time = System.currentTimeMillis();
        int ans = nums.stream()
                    .map(n -> n * 2)
                    .mapToInt(n -> n)
                    .sum();
        long ed_time = System.currentTimeMillis();
        long stream_time = ed_time - strt_time;

        System.out.println(ans);
        System.out.println(stream_time);


        long start_time = System.currentTimeMillis();
        int result = nums.parallelStream()
                    .map(n -> n * 2)
                    .mapToInt(n -> n)
                    .sum();
        long end_time = System.currentTimeMillis();
        long parrel_time = end_time - start_time;

        System.out.println(result);
        System.out.println(parrel_time);
        // System.out.println(time);
        // System.out.println(rm.nextInt(100));
        // System.out.println(nums);
    }
    
}
