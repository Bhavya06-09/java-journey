class PrintData {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(double a) {
        System.out.println("Double: " + a);
    }
    void show(String a) {
        System.out.println("String: " + a);
    }
}
public class DataItems {
    public static void main(String[] args) {
        PrintData obj = new PrintData();
        obj.show(10);
        obj.show(5.5);
        obj.show("Java");
    }
}