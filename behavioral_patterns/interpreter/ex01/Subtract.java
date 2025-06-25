package behavioral_patterns.interpreter.ex01;

/**
 * Subtract 클래스는 두 Expression을 빼는 비터미널(Expression)입니다.
 */
public class Subtract implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    /**
     * Subtract 생성자
     * @param leftExpression 왼쪽 피연산자
     * @param rightExpression 오른쪽 피연산자
     */
    public Subtract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * 두 Expression의 interpret 결과를 빼서 반환합니다.
     */
    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
