package behavioral_patterns.interpreter.ex01;

/**
 * Number 클래스는 숫자 값을 표현하는 터미널(Expression)입니다.
 */
public class Number implements Expression {
    // 숫자 값을 저장하는 변수
    private int number;

    /**
     * Number 생성자
     * @param number 표현할 숫자 값
     */
    public Number(int number) {
        // 전달받은 숫자를 멤버 변수에 저장
        this.number = number;
    }

    /**
     * 저장된 숫자 값을 반환합니다.
     * @return 저장된 숫자
     */
    @Override
    public int interpret() {
        // 저장된 숫자 반환
        return this.number;
    }
}
