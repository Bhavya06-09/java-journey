class Employee {
    static String company = "Tech Corp";   
    String name;
    Employee(String name) {
        this.name = name;
    }
    void work() {
        System.out.println("Employee works");
    }
}
class Developer extends Employee {
    Developer(String name) {
        super(name);   
    }
    @Override
    void work() {
        super.work();  
        System.out.println(name + " writes code at " + company);
    }
}
public class OfficeInfo {
    public static void main(String[] args) {
        Employee e = new Developer("Bhavya"); 
        e.work();
    }
}