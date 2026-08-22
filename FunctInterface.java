@FunctionalInterface
interface Hello{
     int add(int n , int m);

}

// ----------------------------------------------------------------------------> Functional Interfaces and using Lamda expressions
// class Ji implements Hello {
//     public void sayHello(){
//         System.out.println("Say Hello !!");
//     }
// }

public class FunctInterface {
    public static void main(String[] args) {
        Hello h = (n , m) ->  n + m ;     // No ed to use return keyword in lamda expreseions
        

        int result = h.add(66, 55);
        System.out.println(result);



        // Hello h = n -> System.out.println("The Number is: " + n);
    
        // h.printInt(8);

        // Hello h = () -> System.out.println("Heyy !! Im inside Add function");
        // h.add();


        //     public void sayHello(){
        //         System.out.println("Say Helo My friend !!");
        //     }

        // };
        // h.sayHello();

    }
    
}
