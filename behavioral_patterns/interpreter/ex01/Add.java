package behavioral_patterns.interpreter.ex01;

/**
 * Add 클래스는 두 Expression을 더하는 비터미널(Expression)입니다.
 */
public class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    /**
     * Add 생성자
     * @param leftExpression 왼쪽 피연산자
     * @param rightExpression 오른쪽 피연산자
     */
    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * 두 Expression의 interpret 결과를 더하여 반환합니다.
     */
    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
