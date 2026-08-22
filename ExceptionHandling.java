

public class ExceptionHandling {
    public static void main(String[] args) {
        int num = 3;
        int n = 0;
        int arr[] = new int[3] ;        // ie . 0 0 0
        String str = null ;


        try{
             System.out.println("Im before an Exception occurs");
             System.out.println(str.length());

              System.out.println(arr[3]);
            int result = num / n ;
             System.out.println(result);

        }catch(ArithmeticException e){          // it catches specific Exception only
            System.out.println("Something Went wrong ----> " + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something Went wrong ----> " + e);
        }catch(Exception e){
            System.out.println("Something is wrong --> " + e);
        }


        System.out.println("Im after an Exception");
        
    }
    
}
