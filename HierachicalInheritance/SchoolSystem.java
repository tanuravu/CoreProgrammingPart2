package Inheritance.HierarchicalInheritance;

// Base class: Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Test class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Mehak", 20, 4);
        Staff st = new Staff("Anita", 35, "Administration");

        System.out.println("--- Teacher ---");
        t.displayRole();
        System.out.println();

        System.out.println("--- Student ---");
        s.displayRole();
        System.out.println();

        System.out.println("--- Staff ---");
        st.displayRole();
    }
}

