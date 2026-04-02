class Poem {
    void display() {
        System.out.println("This is a poem.");
    }
}
class Haiku extends Poem {
    void showType() {
        System.out.println("This is a haiku poem.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Haiku h = new Haiku();
        h.display();
        h.showType();
    }
}