package structural_patterns.decorator.ex01;

// SimpleCoffee 클래스는 가장 기본적인 커피를 나타냅니다.
public class SimpleCoffee implements Coffee {
    // 커피의 설명을 반환합니다.
    @Override
    public String getDescription() {
        // 단순한 커피라는 설명을 반환합니다.
        return "Simple coffee";
    }

    // 커피의 가격을 반환합니다.
    @Override
    public double getCost() {
        // 기본 커피의 가격은 5.0입니다.
        return 5.0;
    }
}
