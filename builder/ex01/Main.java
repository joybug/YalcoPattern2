package builder.ex01;

/**
 * 피자 빌더 패턴 실행 예제
 * 두 가지 방식으로 피자를 생성하는 것을 보여줌:
 * 1. 연속적인 메서드 체이닝을 통한 생성
 * 2. 단계별 빌더 사용을 통한 조건부 생성
 * 
 * 장점:
 * - 명확한 객체 생성 과정
 * - 유연한 구성 요소 설정
 * - 가독성 높은 코드
 */
public class Main {
 public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder()
                .dough("Thin Crust")
                .sauce("Tomato")
                .topping("Cheese")
                .build();

        System.out.println(myPizza);

        String orderType = "Veggie";

        Pizza.PizzaBuilder pizzaBuilder
         = new Pizza.PizzaBuilder().dough("Regular");

        pizzaBuilder.sauce("Pesto");

        if (orderType.equals("Veggie")) {
            pizzaBuilder.topping("Vegetables");
        } else {
            pizzaBuilder.topping("Pepperoni");
        }

        Pizza customPizza = pizzaBuilder.build();
        System.out.println(customPizza);
    }
}
