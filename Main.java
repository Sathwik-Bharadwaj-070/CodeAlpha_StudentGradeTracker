import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.next();
            System.out.println("Enter marks of student " + (i + 1) + ":");
            double marks = sc.nextDouble();
            students.add(new Student(name, marks));
        }
        double highest=Double.MIN_VALUE;
        double lowest=Double.MAX_VALUE;
         double total=0;
        for(Student s : students) {

    double marks = s.getMarks();

    total += marks;

    if(marks > highest)
        highest = marks;

    if(marks < lowest)
        lowest = marks;
}
int average = (int)(total / students.size());
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
    }
}