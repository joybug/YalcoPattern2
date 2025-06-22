package structural_patterns.decorator.ex01;

// Coffee 인터페이스는 커피 객체가 가져야 할 기능을 정의합니다.
// getDescription()은 커피 설명을, getCost()는 가격을 반환합니다.
public interface Coffee {
    // 커피의 설명(예: "Simple coffee, Milk")을 반환합니다.
    String getDescription();
    // 커피의 가격을 반환합니다.
    double getCost();
}
