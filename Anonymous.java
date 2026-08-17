class A {
    String name = "Santhosh Nerella";
    A (){
        System.out.println(" IM inside a Constructor");
    }
    public void display(){
        System.out.println(" Im inside method");
    }
}





public class Anonymous {
    public static void main(String[] args) {

      new A().display();
      System.out.println(new A().name);      
                                           // Anonymous Obj

    //  System.out.println(a.name);
        
    }
    
}
