package behavioral_patterns.template_method.ex01;

/**
 * 템플릿 메서드 패턴 예제의 메인 클래스입니다.
 * <p>
 * Beverage 추상 클래스를 상속한 Tea, Coffee 객체를 생성하여
 * prepareRecipe()를 호출하면, 각 음료별로 제조 과정이 다르게 동작함을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * Tea, Coffee 객체를 생성하고, prepareRecipe()를 호출하여
     * 템플릿 메서드 패턴의 동작을 확인합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // Tea, Coffee 객체 생성
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe(); // 차 제조 과정 실행

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe(); // 커피 제조 과정 실행
    }
}
