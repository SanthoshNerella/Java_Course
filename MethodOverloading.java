class Addition{

    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public double add(int n1 , double db){
        return n1 + db;
    }

    public float add(float f1 , float f2){
        return f1 + f2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3 ;
    }
}

public class MethodOverloading {


public static void main(String[] args) {
    Addition ad = new Addition();


    // int result = ad.add(3, 4);
    // System.out.println(result);

     System.out.println(ad.add(3, 4));
     System.out.println(ad.add(3,4,5));

     System.out.println(ad.add(5,7.5));
    System.out.println(ad.add(2.3f, 4.5f));
 
}
    
}
