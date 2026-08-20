// class C {
//     public void show(){
//         System.out.println(" Hey hi Im Outer Class");
//     }
// }

 abstract class C {
    public abstract  void EngineMachenism();
}



public class AnonymousClass {
    public static void main(String[] args) {


            // C c = new C()
            // {
            //     public void show(){
            //      System.out.println(" Hey hi Im from Anonysmouse classs");
            //  }

            // };
            //  c.show();

            C c = new C()
            {

                public void EngineMachenism(){
                    System.out.println("Engne is starting");
                }
            };
            c.EngineMachenism();
        
    }
}
