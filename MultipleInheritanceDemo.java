interface Singer {
    void sing();
}
interface WriterSkill {
    void write();
}
class Artist implements Singer, WriterSkill {
    public void sing() {
        System.out.println("Artist sings a melody.");
    }
    public void write() {
        System.out.println("Artist writes a poem.");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Artist a = new Artist();
        a.sing();
        a.write();
    }
}