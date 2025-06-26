package behavioral_patterns.template_method.ex01;

/**
 * 차(Tea) 클래스 - 템플릿 메서드 패턴의 구체 클래스입니다.
 * <p>
 * 차 제조 과정 중 brew(), addCondiments()를 구체적으로 구현합니다.
 */
public class Tea extends Beverage {
    /**
     * 차를 우려내는 동작을 구현합니다.
     * @Override
     */
    @Override
    void brew() {
        // 차를 우려내는 과정
        System.out.println("Steeping the tea");
    }

    /**
     * 차에 레몬을 추가하는 동작을 구현합니다.
     * @Override
     */
    @Override
    void addCondiments() {
        // 레몬 추가
        System.out.println("Adding lemon");
    }
}
