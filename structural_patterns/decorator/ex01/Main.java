package structural_patterns.decorator.ex01;

// Main 클래스는 데코레이터 패턴을 이용한 커피 조합을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 가장 기본 커피를 만듭니다.
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(
            simpleCoffee.getDescription()
             + " $" + simpleCoffee.getCost()
        );
        
        // 우유가 추가된 커피를 만듭니다.
        Coffee milkCoffee = new MilkDecorator(
            new SimpleCoffee());
        System.out.println(
            milkCoffee.getDescription()
             + " $" + milkCoffee.getCost()
        );

        // 우유와 설탕이 모두 추가된 커피를 만듭니다.
        Coffee milkAndSugarCoffee = new SugarDecorator(
            new MilkDecorator(
                new SimpleCoffee()
            )
        );
        
        System.out.println(
            milkAndSugarCoffee.getDescription()
            + " $" + milkAndSugarCoffee.getCost()
        );
    }
}
