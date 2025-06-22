package structural_patterns.decorator.ex01;

// SugarDecorator 클래스는 커피에 설탕을 추가하는 데코레이터입니다.
public class SugarDecorator extends CoffeeDecorator {
    // 생성자: 데코레이팅할 Coffee 객체를 받아 부모 생성자에 전달합니다.
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    // 커피 설명에 ", Sugar"를 추가합니다.
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    // 커피 가격에 설탕 가격(0.5)을 추가합니다.
    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
