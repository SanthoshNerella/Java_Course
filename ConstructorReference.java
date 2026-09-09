import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name ;
    int age;
    
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
    
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Santhosh" , "Pranay ", "vivek");
        List<Student> std = new ArrayList<>();
        std = names.stream()
              .map(Student :: new)             //  .map(name -> new Student(name))
              .toList();
        System.out.println(std);

    }
    
}
