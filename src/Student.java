import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int studentID;
    int score;

    static ArrayList<Student> students = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);

    Student(String name, int studentID, int score) {
        this.name = name;
        this.studentID = studentID;
        this.score = score;
    }

    public String printStudent() {
        return "name : " + name + ", studentID : " + studentID + ", score : " + score;

    }

    public static int register_student(){
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter student ID : ");
        int studentID = sc.nextInt();
        System.out.println("enter score : ");
        int score = sc.nextInt();
        students.add(new Student(name, studentID, score));
        System.out.println();

        return studentID;
    }
    public static void print_students_by_name() {
        System.out.println("enter name : ");
        String findName = sc.next();
        for (Student s : Student.students) {
            if(s.name.equals(findName)){
                System.out.println(s.printStudent());
            }
            else {
                System.out.println("Name not find");
            }
        }
        System.out.println();
    }
    public static void print_students_by_name(String findName) {
        for (Student s : Student.students) {
            if(s.name.equals(findName)){
                System.out.println(s.printStudent());
            }
            else {
                System.out.println("Name not find");
            }
        }
        System.out.println();
    }

    public static int edit_student() {
        if (students.size() == 0) {
            System.out.println("no student");
            return -1;
        }
        System.out.print("enter name : ");
        String amendName = sc.next();
        for (Student s : Student.students) {
            if(s.name.equals(amendName)){
                System.out.println("current info : "+s.printStudent());
                System.out.print("enter new_name : ");
                String new_name = sc.next();
                System.out.print("enter new_student ID : ");
                int new_studentID = sc.nextInt();
                System.out.print("enter new_score : ");
                int new_score = sc.nextInt();
                Student.students.remove(s);
                Student.students.add(new Student(new_name, new_studentID, new_score));
            }
        }
        System.out.println();
        return 0;
    }

    public static void delete_student() {
        System.out.println("enter name : ");
        String deleteName = sc.next();
        for (Student s : Student.students) {
            if(s.name.equals(deleteName)){
                Student.students.remove(s);
            }
            else {
                System.out.println("Name not find");
                return;
            }
        }
        System.out.println();
    }

    public static double getAverage() {
        double sum = 0;
        for (Student s : Student.students) {
            sum += s.score;
        }
        return sum / students.size();
    }
}