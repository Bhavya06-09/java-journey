class MathOps {
    int multiply(int a, int b) {  
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MathOps ops = new MathOps();
        System.out.println(ops.multiply(2, 3));      
        System.out.println(ops.multiply(2.5, 3.5));  
        System.out.println(ops.multiply(2, 3, 4));   
    }
}
