class calc {
    String name = "Santhosh Nerella";
    int add(int n1 , int n2){
        return n1 + n2;
    }
    int sub(int n1 , int n2){
        return n1 - n2;
    }
}
class AdvCalc extends calc {
    int div(int n1 , int n2){
        return n1 / n2;
    }
}

public class SingleInhertence {
    public static void main(String[] args) {
        calc cc = new calc();
        System.out.println(cc.name);
        AdvCalc ad = new AdvCalc();
        System.out.println(ad.add(4,6));
        System.out.println(ad.name);
        
    }
}
