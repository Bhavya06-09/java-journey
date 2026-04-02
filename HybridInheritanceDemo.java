class Person {
    void showName() {
        System.out.println("Person is creative.");
    }
}
interface Dancer {
    void dance();
}
interface Painter {
    void paint();
}
class CreativePerson extends Person implements Dancer, Painter {
    public void dance() {
        System.out.println("Creative person dances gracefully.");
    }
    public void paint() {
        System.out.println("Creative person paints beautifully.");
    }
}
public class HybridInheritanceDemo {
    public static void main(String[] args) {
        CreativePerson c = new CreativePerson();
        c.showName();
        c.dance();
        c.paint();
    }
}