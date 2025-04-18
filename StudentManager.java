import java.util.*;

import exceptions.*;

public class StudentManager {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter PRN:");
        String prn = sc.next();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                throw new DuplicateStudentException("Student with PRN already exists!");
            }
        }

        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter DOB:");
        String dob = sc.next();
        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully.");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) s.display();
    }
    public void searchMenu() {
        System.out.println("Search by: 1. PRN  2. Name  3. Position");
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> searchByPRN();
            case 2 -> searchByName();
            case 3 -> searchByPosition();
            default -> System.out.println("Invalid option.");
        }
    }
    public void searchByPRN() {
        System.out.println("Enter PRN to search:");
        String prn = sc.next();
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                s.display();
                return;
            }
        }
        throw new StudentNotFoundException("PRN not found.");
    }
    public void searchByName() {
        System.out.println("Enter Name to search:");
        String name = sc.next();
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                return;
            }
        }
        throw new StudentNotFoundException("Name not found.");
    }
    public void searchByPosition() {
        System.out.println("Enter Position (index starting from 0):");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= students.size()) {
            throw new StudentNotFoundException("Invalid position.");
        }
        students.get(pos).display();
    }
