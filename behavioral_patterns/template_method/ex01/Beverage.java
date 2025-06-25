package behavioral_patterns.template_method.ex01;

/**
 * 음료 제조를 위한 템플릿 메서드 패턴의 추상 클래스
 */
public abstract class Beverage {
    // 템플릿 메서드
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();
}
