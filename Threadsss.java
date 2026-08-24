class Boree extends Thread {
public void run() {
    for(int i = 0 ; i < 100 ; i++)  System.out.println("Hello");
}
}
class AgainBore extends Thread{
    public void run(){
         for(int i = 0 ; i < 100 ; i++)  System.out.println("Namstea");
        
    }
}


public class Threadsss {
    public static void main(String[] args) {
        Boree br = new Boree();
        AgainBore abr = new AgainBore();
        br.start();
        abr.start();
        
        
    }
    
}
