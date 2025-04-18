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
