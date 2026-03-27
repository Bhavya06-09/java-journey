class AreaCalculator {
    int area(int side) {
        return side * side;  // square
    }
    int area(int length, int breadth) {
        return length * breadth;  // rectangle
    }
    double area(double radius) {
        return 3.14 * radius * radius;  // circle
    }
}
public class Area {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        System.out.println("Square: " + a.area(4));
        System.out.println("Rectangle: " + a.area(4, 5));
        System.out.println("Circle: " + a.area(3.0));
    }
}