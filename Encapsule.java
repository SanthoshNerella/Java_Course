class Student {

     private String name = "Hello";
     private int rollNo = 62;
     private int age = 19;

     public int getRollNo(){
        return rollNo;
     }
     public void setRollNo(int num){
        rollNo = num;
     }
     public int getAge(){
        return age;
     }
     public void setAge(int n){
        age = n ;
     }
     public String getName(){
        return name;
     }
     public void setString(String str){
        name = str;
    
     }

}

public class Encapsule {


    public static void main(String[] args) {
        Student s1 = new Student();


        // s1.age = 21;
        // s1.name = "Santhosh";
        // s1.rollNo = 61;
        // System.out.println(s1.age);
        // System.out.println(s1.name);


        s1.setAge(21);
        s1.setRollNo(61);
        s1.setString("santhosh");

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());




        
    }
    
}
