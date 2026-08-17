class Student{
    int rollNo;
    String name;
   static String clgName;

    public void studDetails(){               // Non - static method
        System.out.println(rollNo + " " + name + " " + clgName);
    }
    public static void studDetails1(Student st){
        System.out.println(st.rollNo + " " + st.name + " " + clgName);
      
    }

}



public class pracStatic {
    public static void main(String[] args) {
        Student st = new Student();
        // st.clgName = "Sri Indu";
        st.name = "Santhosh Nerella";
        st.rollNo = 61;
         Student st1 = new Student();
        // st1.clgName = "Sri Indu";
        st1.name = "Chandu";
        st1.rollNo = 62;
        Student.clgName = "CBIT";


        // st.studDetails();
        // st1.studDetails();

        Student.studDetails1(st1);


        
    }
    
}
