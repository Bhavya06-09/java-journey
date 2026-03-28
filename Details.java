class Person {
    String name;
    int age;
    Person() {
        this("Unknown", 0); 
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
public class Details {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}