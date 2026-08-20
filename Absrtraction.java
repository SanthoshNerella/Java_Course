abstract class Car{
    public abstract void carMode();
    int num1= 8;

    public void playingMusic(){
        System.out.println("currenty we are on playing Musiccc");
    }
}

abstract class Fortuner extends Car{
    public void carMode(){
        System.out.println(" Car Engine is starting now plzz use set belt");
    }
    public  abstract void EngineMechanism();

}
class Fortu extends Fortuner {
    public   void EngineMechanism(){
        System.out.println("Engine maechanism is hden inside");
    }
}

public class Absrtraction {
    public static void main(String[] args) {

        // Fortuner f1 = new Fortuner();
        // // f1.playingMusic();
        // f1.carMode();
        // System.out.println(f1.num1);


        Fortu f1 = new Fortu();
        f1.EngineMechanism();
        

        
    }
    
}
