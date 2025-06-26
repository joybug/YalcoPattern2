package behavioral_patterns.interpreter.ex01;

/**
 * Main 클래스는 인터프리터 패턴의 동작을 테스트하는 실행 예제입니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * 인터프리터 패턴을 사용한 수식 해석 기능을 시연합니다.
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 숫자 5, 2, 3을 각각 Expression 객체로 생성
        Expression five = new Number(5);
        Expression two = new Number(2);
        Expression three = new Number(3);

        // (5 + 2) 연산을 Expression으로 구성
        Expression addExpression = new Add(five, two);

        // (5 + 2) - 3 연산을 Expression으로 구성
        Expression subtractExpression = new Subtract(addExpression, three);

        // 최종 결과 출력: (5 + 2) - 3 = 4
        System.out.println("(5 + 2) - 3 = " + subtractExpression.interpret());
    }
}
