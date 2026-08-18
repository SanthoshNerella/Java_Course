class A {
    A(){
        super();
        System.out.println("From A consrtucor");
    }
    A(int n){
        super();
        System.out.println("From A construcot & n ");
    }
}
class B extends A {
    B(){
        super(4);
        System.out.println("from B constructor");
    }
     B(int n){
        // super(n);
        // super();
        this();
        System.out.println("From B construcotr & n ");
     }
}


// super() ---> it calls the construcoter of prent class
// this() ----> calls the construcotr of same class only




public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B(6);
        
    }
    
}
