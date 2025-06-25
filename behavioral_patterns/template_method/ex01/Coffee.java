package behavioral_patterns.template_method.ex01;

/**
 * 커피(Coffee) 클래스 - 템플릿 메서드 패턴의 구체 클래스
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
