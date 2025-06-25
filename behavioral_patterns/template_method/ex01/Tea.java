package behavioral_patterns.template_method.ex01;

/**
 * 차(Tea) 클래스 - 템플릿 메서드 패턴의 구체 클래스
 */
public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
