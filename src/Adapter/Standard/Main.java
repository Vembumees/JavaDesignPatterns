package Adapter.Standard;

public class Main {

    public static void main(String[] args) {
        System.out.println("ADAPTER PATTERN");
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle t = new Triangle(20, 10);
        System.out.println("Area of Triangle is " + calculatorAdapter.getArea(t) + " Square unit");
    }
}
