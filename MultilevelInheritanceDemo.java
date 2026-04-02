class Writer {
    void think() {
        System.out.println("Writer is thinking.");
    }
}

class Poet extends Writer {
    void compose() {
        System.out.println("Poet is composing lines.");
    }
}
class GhazalPoet extends Poet {
    void perform() {
        System.out.println("Ghazal poet is performing.");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        GhazalPoet g = new GhazalPoet();
        g.think();
        g.compose();
        g.perform();
    }
}