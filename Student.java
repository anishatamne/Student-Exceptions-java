public class Student {
    String prn, name, dob;
    double marks;

    // Constructor
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Display info
    public void display() {
        System.out.printf("PRN: %s | Name: %s | DOB: %s | Marks: %.2f%n", prn, name, dob, marks);
    }
}
