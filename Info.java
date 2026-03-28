class Student {
    String name;
    static String college = "ABC College";  
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name + " - " + college);
    }
}
public class Info {
    public static void main(String[] args) {
        Student s1 = new Student("Bhavya");
        Student s2 = new Student("Anushka");
        s1.display();
        s2.display();
    }
}