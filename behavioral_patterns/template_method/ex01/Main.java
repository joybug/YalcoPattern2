package behavioral_patterns.template_method.ex01;

/**
 * 템플릿 메서드 패턴 예제의 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
