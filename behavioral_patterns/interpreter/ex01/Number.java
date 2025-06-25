package behavioral_patterns.interpreter.ex01;

/**
 * Number 클래스는 숫자 값을 표현하는 터미널(Expression)입니다.
 */
public class Number implements Expression {
    private int number;

    /**
     * Number 생성자
     * @param number 표현할 숫자 값
     */
    public Number(int number) {
        this.number = number;
    }

    /**
     * 저장된 숫자 값을 반환합니다.
     */
    @Override
    public int interpret() {
        return this.number;
    }
}
