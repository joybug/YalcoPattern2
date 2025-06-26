package behavioral_patterns.interpreter.ex01;

/**
 * Add 클래스는 두 Expression을 더하는 비터미널(Expression)입니다.
 */
public class Add implements Expression {
    // 왼쪽 피연산자
    private Expression leftExpression;
    // 오른쪽 피연산자
    private Expression rightExpression;

    /**
     * Add 생성자
     * @param leftExpression 왼쪽 피연산자
     * @param rightExpression 오른쪽 피연산자
     */
    public Add(Expression leftExpression, Expression rightExpression) {
        // 전달받은 피연산자를 멤버 변수에 저장
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * 두 Expression의 interpret 결과를 더하여 반환합니다.
     * @return 두 피연산자의 합
     */
    @Override
    public int interpret() {
        // 왼쪽, 오른쪽 Expression의 interpret 결과를 더함
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
