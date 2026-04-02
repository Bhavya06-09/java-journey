class Instrument {
    void sound() {
        System.out.println("Instrument makes sound.");
    }
}

class Guitar extends Instrument {
    void strings() {
        System.out.println("Guitar has strings.");
    }
}

class Drum extends Instrument {
    void beat() {
        System.out.println("Drum gives rhythm.");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Drum d = new Drum();
        g.sound();
        g.strings();
        d.sound();
        d.beat();
    }
}