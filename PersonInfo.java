class Person {
    String name;
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
    void display() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    int marks;
    Student(String name, int marks) {
        super(name);  
        this.marks = marks;
        System.out.println("Student constructor called");
    }
    void display() {
        super.display();  
        System.out.println("Marks: " + marks);
    }
}
public class PersonInfo {
    public static void main(String[] args) {
        Student s = new Student("Bhavya", 90);
        s.display();
    }
}