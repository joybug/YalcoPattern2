package behavioral_patterns.interpreter.ex01;

/**
 * Expression 인터페이스는 해석(interpret) 동작을 정의합니다.
 * 모든 수식 요소(숫자, 연산자)는 이 인터페이스를 구현해야 합니다.
 */
public interface Expression {
    /**
     * 수식의 값을 해석하여 반환합니다.
     * @return 해석된 정수 값
     */
    int interpret();
}
