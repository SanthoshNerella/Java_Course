class Calc{
    public int add(int n1, int n2){                 // parent class 
        return n1 + n2;
    }
}
class AdvCalc extends Calc{                                     // child class  & extends keyword used to inherit parent calss methods and varibles
    public int add(int n1 , int n2){
        return n1 + n2 + 3;
    }
}

//Method Overriding = Child class overridies the PAret calss method siganture

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();

    //    System.out.println(ac.add(4, 5));
    int result = ac.add(5,6);
    System.out.println(result);



        
    }
    
}
