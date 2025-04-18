

##  Project Overview

This is a **menu-driven Java console application** designed to manage student records. It demonstrates key Object-Oriented Programming concepts like:

- Classes and Objects
- Constructors
- ArrayList
- Custom Exceptions
- Encapsulation
- Exception Handling
- Modular Programming with Multiple Files

---

##  Features

-  **Add Student**  
  Add a new student using PRN, name, date of birth, and marks.  
   Throws `DuplicateStudentException` if PRN already exists.

-  **Display All Students**  
  View all stored student details in a formatted way.

-  **Search Student**  
  Search options:
  - By PRN
  - By Name
  - By Position (Index-based)  
    Throws `StudentNotFoundException` if student is not found.

-  **Update Student**  
  Update name, DOB, and marks using PRN as a key.  
  ➤ Throws `StudentNotFoundException` if PRN not found.

- ✅ **Delete Student**  
  Delete a student record using PRN.  
   Throws `StudentNotFoundException` if PRN not found.

-  **Exception Handling**  
  - `StudentNotFoundException`
  - `DuplicateStudentException`

---



