import java.util.*;

class Student implements Comparable <Student> {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Student that) {
           if(this.age > that.age) return 1;
           else return -1;
    }
    

    
}


public class ComparablePractise {

    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Santhosh", 22));
        stud.add(new Student("Pranay", 21));
        stud.add(new Student("Abhinav", 22));
        stud.add(new Student("Abhilash", 20));
        System.out.println(stud);
        Collections.sort(stud);
        System.out.println("After sorting");
        System.out.println(stud);
        
    }
    
}
