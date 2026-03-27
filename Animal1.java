class Animal {
    void move() {
        System.out.println("Animals can move");
    }
}
class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Bird flies");
    }
}
class Fish extends Animal {
    @Override
    void move() {
        System.out.println("Fish swims");
    }
}
public class Animal1 {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        Animal a2 = new Fish();
        a1.move();
        a2.move();
    }
}