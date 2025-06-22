package structural_patterns.decorator.ex01;

// CoffeeDecorator 클래스는 Coffee 인터페이스를 구현하는 데코레이터의 기본 클래스입니다.
// 실제 데코레이터(우유, 설탕 등)는 이 클래스를 상속받아 기능을 확장합니다.
public class CoffeeDecorator implements Coffee {
    // 데코레이팅할 Coffee 객체를 참조합니다.
    protected Coffee decoratedCoffee;

    // 생성자: 데코레이팅할 Coffee 객체를 받아 저장합니다.
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    // Coffee 인터페이스의 getDescription 메소드 구현
    // 기본적으로 내부 Coffee의 설명을 반환합니다.
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    // Coffee 인터페이스의 getCost 메소드 구현
    // 기본적으로 내부 Coffee의 가격을 반환합니다.
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
