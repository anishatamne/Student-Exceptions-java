/*
Name: Anisha Tamne
PRN: 23070126014
Batch: A1
*/

import java.util.Scanner;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Data Entry System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.displayStudents();
                case 3 -> manager.searchMenu();
                case 4 -> manager.updateStudent();
                case 5 -> manager.deleteStudent();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
