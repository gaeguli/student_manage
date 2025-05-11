import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("register student : 1\n find student : 2\n print all students : 3\n amend student : 4\n delete student : 5\n exit : 5");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: // Register a new student
                    System.out.println("register student : 1");
                    Student.register_student();
                    break;
                case 2: // Find a student by name
                    System.out.println("find student : 2");
                    Student.print_students_by_name();
                    break;
                case 3: // Print all students
                    System.out.println("print all students : 3");
                    for (Student s : Student.students) {
                        System.out.println(s.printStudent());
                        System.out.println();
                    }
                    break;
                case 4: // Edit student information
                    System.out.println("amend : 4");
                    Student.edit_student();
                    break;
                case 5: // Delete a student
                    System.out.println("delete student : 5");
                    Student.delete_student();
                    break;
                case 6: // Exit the program
                    System.out.println("exit : 6");
                    return;
                default: // Invalid input
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}