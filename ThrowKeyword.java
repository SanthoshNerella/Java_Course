class Mymistake extends Exception{
    public Mymistake(String msg){
        super(msg);

    }
}
public class ThrowKeyword {
 public static void main(String[] args) {
    int age = 18;
    int k = 0;
    try{
        if(age < 20){
            throw new Mymistake("Somethng wrong");
        }

    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    System.err.println(k);
 }   
}
