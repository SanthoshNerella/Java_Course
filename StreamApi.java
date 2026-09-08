import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,3,1,2,4,8,9,2,8,9,21,24,56,71,40);
        int result  = nums.stream()
                             .filter(n -> n % 2 == 0)
                             .mapToInt(n -> n)
                             .sum();
        System.out.println(result);

        int s1 = nums.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .reduce(0, (c,e) -> c + e) ;
        System.out.println(s1);

        Stream<Integer>  s2 =  nums.stream()
                               .distinct();
        s2.forEach(n -> System.out.print(n + " "));
        

        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // // System.out.println(s2);
        // s3.forEach(n -> System.out.println(n));


    }
    
}
