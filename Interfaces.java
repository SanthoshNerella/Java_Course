interface Computer{
     void code();
     int val = 89;
     
}
interface oldComputer {
    void PseudoCode();
}
class Desktop implements Computer,oldComputer {
    public void code(){
        System.out.println("Coding..Checking. .. Running..Deployinggg");
    }
    public void PseudoCode(){
        System.out.println(" writing pseudocode");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Computer cc = new Desktop();
        oldComputer oc = new Desktop();
        cc.code();
        oc.PseudoCode();
        // Computer.val = 68 ;
        
    }
    
}
