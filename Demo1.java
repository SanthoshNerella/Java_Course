class Student{
    int Rollno;
    String name;
    int marks;
}
public class Demo1{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.Rollno = 61;
        s1.name = "Santhosh Nerella";
        s1.marks = 98;

        Student s2 = new Student();
        s2.Rollno = 62;
        s2.name = "Prabhas Kumar";
        s2.marks = 96;


        Student s3 = new Student();
        s3.Rollno = 63;
        s3.name = "Pranay Kumar";
        s3.marks = 99;


        Student stu[] = new Student[3];
        stu[0]= s1;
        stu[1]= s2;
        stu[2]= s3;
        for (Student s : stu) {
    System.out.println(s.Rollno + " ," + s.name + " ," + s.marks);
}



        // System.out.println(s1.Rollno + " ," + s1.name + " ," + s1.marks);
        //  System.out.println(s2.Rollno + " ," + s2.name + " ," + s2.marks);
        //   System.out.println(s3.Rollno + " ," + s3.name + " ," + s3.marks);

    }
}