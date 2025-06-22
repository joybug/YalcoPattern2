package structural_patterns.decorator.ex01;

// MilkDecorator 클래스는 커피에 우유를 추가하는 데코레이터입니다.
public class MilkDecorator extends CoffeeDecorator {
    // 생성자: 데코레이팅할 Coffee 객체를 받아 부모 생성자에 전달합니다.
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    // 커피 설명에 ", Milk"를 추가합니다.
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    // 커피 가격에 우유 가격(1.5)을 추가합니다.
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
