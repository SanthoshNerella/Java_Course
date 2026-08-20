class R {
    public void show(){
        System.out.println(" Im from Class R");
    }
}
class k extends R{
    public void show1(){
        System.out.println("Im from class K ... !!");
    }
}



public class UpcastingDowncasting {



    public static void main(String[] args) {


    R obj = new k();            // UPcasting
    obj.show();
    // obj.show1();

    k obj1 = (k) obj;        //Downcasting
    obj1.show1();


        
    }
    
}
