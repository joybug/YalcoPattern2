package builder.ex01;

/**
 * 빌더 패턴을 사용한 피자 클래스
 * 빌더 패턴은 복잡한 객체를 단계별로 생성할 수 있게 해주는 생성 패턴입니다.
 * 
 * 특징:
 * 1. 객체 생성과 표현을 분리합니다.
 * 2. 동일한 생성 절차로 서로 다른 표현을 만들 수 있습니다.
 * 3. 각 구성 요소를 단계별로 추가할 수 있습니다.
 * 
 * 구성요소:
 * - dough: 피자 도우 종류
 * - sauce: 피자 소스 종류
 * - topping: 피자 토핑 종류
 */
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Private constructor to enforce the use of Builder
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, "
         + sauce + " sauce, and " + topping + " topping.";
    }

    /**
     * 피자를 구성하는 빌더 내부 클래스
     * 각 구성요소를 단계적으로 설정할 수 있게 해줌
     * 
     * 피자 빌더 클래스
     * - 피자 객체를 단계별로 생성하는 역할을 담당
     * - 각 메서드는 자기 자신을 반환하여 메서드 체이닝이 가능하게 함
     * - build() 메서드를 호출하여 최종적으로 피자 객체를 생성
     */
    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String topping;

        /**
         * 피자 도우를 설정하는 메소드
         * @param dough 도우 종류
         * @return PizzaBuilder 인스턴스
         */
        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        /**
         * 피자 소스를 설정하는 메소드
         * @param sauce 소스 종류
         * @return PizzaBuilder 인스턴스
         */
        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        
        /**
         * 피자 토핑을 설정하는 메소드
         * @param topping 토핑 종류
         * @return PizzaBuilder 인스턴스
         */
        public PizzaBuilder topping(String topping) {
            this.topping = topping;
            return this;
        }

        /**
         * 설정된 구성요소로 피자 객체를 생성하는 메소드
         * @return 완성된 Pizza 객체
         */
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
