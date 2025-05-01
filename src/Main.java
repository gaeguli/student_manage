import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("register student : 1, find student : 2, print all students : 3, amend student : 4, delete student : 5, exit : 5");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: // add student
                    System.out.println("register student : 1");
                    System.out.println("enter name : ");
                    String name = sc.next();
                    System.out.println("enter student ID : ");
                    int studentID = sc.nextInt();
                    System.out.println("enter score : ");
                    int score = sc.nextInt();
                    students.add(new Student(name, studentID, score));
                    break;
                case 2: // search_student
                    System.out.println("find student : 2");
                    System.out.println("enter name : ");
                    String findName = sc.next();
                    for (Student s : students) {
                        if(s.name.equals(findName)){
                            System.out.println(s.printStudent());
                        }
                        else {
                            System.out.println("Name not find");
                        }
                    }
                    break;
                case 3: // print all student
                    System.out.println("print all students : 3");
                    for (Student s : students) {
                        System.out.println(s.printStudent());
                    }
                    break;
                case 4: // amend student
                    System.out.println("amend : 4");
                    System.out.print("enter name : ");
                    String amendName = sc.next();
                    for (Student s : students) {
                        if(s.name.equals(amendName)){
                            System.out.println("current info : "+s.printStudent());
                            System.out.print("enter new_name : ");
                            String new_name = sc.next();
                            System.out.print("enter new_student ID : ");
                            int new_studentID = sc.nextInt();
                            System.out.print("enter new_score : ");
                            int new_score = sc.nextInt();
                            students.remove(students.indexOf(s));
                            students.add(new Student(new_name, new_studentID, new_score));
                        }
                    }
                    break;
                case 5: // delete student
                    System.out.println("delete student : 5");
                    System.out.println("enter name : ");
                    String deleteName = sc.next();
                    for (Student s : students) {
                        if(s.name.equals(deleteName)){
                            students.remove(students.indexOf(s));
                        }
                        else {
                            System.out.println("Name not find");
                        }
                    }
                    break;
                case 6:
                    System.out.println("exit : 6");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}