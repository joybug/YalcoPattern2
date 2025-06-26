package behavioral_patterns.template_method.ex01;

/**
 * 커피(Coffee) 클래스 - 템플릿 메서드 패턴의 구체 클래스입니다.
 * <p>
 * 커피 제조 과정 중 brew(), addCondiments()를 구체적으로 구현합니다.
 */
public class Coffee extends Beverage {
    /**
     * 커피를 우려내는 동작을 구현합니다.
     * @Override
     */
    @Override
    void brew() {
        // 커피를 필터로 내리는 과정
        System.out.println("Dripping coffee through filter");
    }

    /**
     * 커피에 설탕과 우유를 추가하는 동작을 구현합니다.
     * @Override
     */
    @Override
    void addCondiments() {
        // 설탕과 우유 추가
        System.out.println("Adding sugar and milk");
    }
}
