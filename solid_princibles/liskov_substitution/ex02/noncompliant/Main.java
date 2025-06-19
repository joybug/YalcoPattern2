package solid_princibles.liskov_substitution.ex02.noncompliant;

// Usage
public class Main {
    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        // LSP Violation
        Rectangle rectangle = new Rectangle();
        calculator.calculateArea(rectangle); // Output: Area: 20

        Square square = new Square();
        calculator.calculateArea(square); // Output: Area: 16 (Unexpected)
    }
}

