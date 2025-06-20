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
        // 1. 빌더를 사용하여 피자 객체를 메서드 체이닝 방식으로 생성
        //    - 도우, 소스, 토핑을 순차적으로 설정 후 build()로 완성
        Pizza myPizza = new Pizza.PizzaBuilder()
                .dough("Thin Crust")
                .sauce("Tomato")
                .topping("Cheese")
                .build();

        // 2. 완성된 피자 정보 출력
        System.out.println(myPizza);

        // 3. 주문 타입에 따라 피자 토핑을 다르게 설정하는 예시
        String orderType = "Veggie";

        // 4. 빌더 객체를 생성하고 도우만 먼저 설정
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder().dough("Regular");

        // 5. 소스를 추가로 설정
        pizzaBuilder.sauce("Pesto");

        // 6. 주문 타입에 따라 토핑을 다르게 설정
        if (orderType.equals("Veggie")) {
            pizzaBuilder.topping("Vegetables");
        } else {
            pizzaBuilder.topping("Pepperoni");
        }

        // 7. 최종적으로 피자 객체를 완성하고 출력
        Pizza customPizza = pizzaBuilder.build();
        System.out.println(customPizza);
    }
}
