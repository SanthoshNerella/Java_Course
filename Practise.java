import java.util.Scanner;

public class Practise {

    static int totalMarks(int a, int b, int c) {
        int totalMarks = a + b + c;
        return totalMarks;
    }

    static float avergeMarks(int a, int b, int c) {
        float average = (a + b + c) / 3.0f;
        return average;
    }

    static String gradePoint(float average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    static void displayResult(int a, int b, int c) {

        System.out.println("Marks for subject 1: " + a);
        System.out.println("Marks for subject 2: " + b);
        System.out.println("Marks for subject 3: " + c);

        System.out.println("Total: " + totalMarks(a, b, c));

        float average = avergeMarks(a, b, c);

        System.out.println("Average: " + average);
        System.out.println("Your Grade is: " + gradePoint(average));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int marks3 = sc.nextInt();

        displayResult(marks1, marks2, marks3);

        sc.close();
    }
}
