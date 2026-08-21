enum Status {
    Running(2000), Playying(5000), Updating(), Pending(80390);

    private int val;
    int age = 5 ;

    private Status(int val){
        this.val = val ;

    }
    private Status(){
        this.val = 500;
    }
     public int getVal(){
        return val;
     }
     public void details(){
        System.out.println("Hello from Enum class");
     }

}


public class Enumeration {
    public static void main(String[] args) {

        // Status st = Status.Pending;
        // System.out.println(st);

        // System.out.println(st.ordinal());


        Status[] st = Status.values();
        for(Status s : st){
            System.out.println(s.name() + ":" + s.getVal());
            s.details();
        }
        
    }
    
}
