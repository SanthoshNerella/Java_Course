// import java.util.Scanner;


class Student{
     String name ;
    int age;
    public Student(){
        System.out.println("Hey hii Im from Constructer !! hehhe");
        name = "santhosh";
        age = 61 ;
    }
    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}




public class Constructor {
    public static void main(String[] args) {
        Student st = new Student("Santhosh",21);
        // Student st = new Student();


        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // String name = sc.nextLine();
        System.out.println(st.age);
        System.out.println(st.name);
    }
    
}
