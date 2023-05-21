package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double resultAdd = calculator.add(5.4, 2.1);
        System.out.println("Addition: " + resultAdd);

        double resultMinus = calculator.minus(10.8, 4.2);
        System.out.println("Subtraktion: " + resultMinus);

        double resultDivide = calculator.divide(15.6, 3.0);
        System.out.println("Division: " + resultDivide);

        double resultMultiply = calculator.multiply(2.5, 4.0);
        System.out.println("Multiplikation: " + resultMultiply);
    }

}
