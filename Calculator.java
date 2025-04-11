public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(2, 3));             // 5
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));     // 6
        System.out.println("add(double, double): " + calc.add(2.5, 3.5));   // 6.0
        System.out.println("add(int, double): " + calc.add(3, 4.5));        // 7.5
