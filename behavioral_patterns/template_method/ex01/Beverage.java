package behavioral_patterns.template_method.ex01;

/**
 * 음료 제조를 위한 템플릿 메서드 패턴의 추상 클래스입니다.
 * <p>
 * prepareRecipe() 메서드가 전체 제조 과정을 정의하고,
 * brew(), addCondiments()는 하위 클래스에서 구체적으로 구현합니다.
 */
public abstract class Beverage {
    /**
     * 템플릿 메서드: 음료 제조 전체 과정을 순서대로 실행합니다.
     * 하위 클래스에서 오버라이드하지 못하도록 final로 선언합니다.
     */
    final void prepareRecipe() {
        // 1. 물 끓이기
        boilWater();
        // 2. 우려내기(추상 메서드)
        brew();
        // 3. 컵에 붓기
        pourInCup();
        // 4. 첨가물 넣기(추상 메서드)
        addCondiments();
    }

    /**
     * 물을 끓이는 공통 동작
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 컵에 붓는 공통 동작
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 우려내기(커피/차에 따라 다름) - 하위 클래스에서 구현
     */
    abstract void brew();
    /**
     * 첨가물 넣기(커피/차에 따라 다름) - 하위 클래스에서 구현
     */
    abstract void addCondiments();
}
