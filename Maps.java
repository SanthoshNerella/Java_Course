// import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
    Map <String ,Integer> student = new HashMap<>();
     student.put("Santhosh", 61);
     student.put("Pranay" , 63);
     student.put("Sam" , 64);
     student.put("Hello" , 78);

     System.out.println(student.keySet());
     System.out.println(student);
     System.out.println(student.values());

     System.out.println(student.get("Santhosh"));
     System.out.println(student.size());
     System.out.println(student.containsKey("pranay"));
     System.out.println(student.containsValue(61));
     System.out.println(student.remove("Santhosh"));
     System.out.println(student.entrySet());

     for(Map.Entry<String,Integer> entry : student.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
     }


    }
    
}
