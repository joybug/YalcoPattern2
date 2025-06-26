package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * WhereExpression 클래스는 WHERE 절을 해석하는 표현식입니다.
 * 조건에 맞는 행만 결과로 반환합니다.
 */
class WhereExpression implements Expression {
    // 컬럼명
    private String column;
    // 연산자(=, >, < 등)
    private String operator;
    // 비교할 값
    private String value;
    // 테이블 이름
    private String tableName;

    /**
     * WhereExpression 생성자
     * @param tableName 테이블 이름
     * @param column 컬럼명
     * @param operator 연산자
     * @param value 비교할 값
     */
    public WhereExpression(String tableName, String column, String operator, String value) {
        this.tableName = tableName;
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    /**
     * WHERE 절을 해석하여 조건에 맞는 행만 반환합니다.
     * @param context 데이터베이스 컨텍스트
     * @return 조건을 만족하는 행 리스트
     */
    @Override
    public List<Map<String, String>> interpret(Context context) {
        List<Map<String, String>> result = new ArrayList<>();
        List<Map<String, String>> table = context.getTable(tableName);
        for (Map<String, String> row : table) {
            // 조건을 평가하여 true면 결과에 추가
            if (evaluate(row.get(column), operator, value)) {
                result.add(row);
            }
        }
        return result;
    }

    /**
     * 연산자에 따라 조건을 평가하는 메서드
     * @param columnValue 컬럼 값
     * @param operator 연산자
     * @param value 비교할 값
     * @return 조건 만족 여부
     */
    private boolean evaluate(String columnValue, String operator, String value) {
        switch (operator) {
            case "=":
                return columnValue.equals(value);
            case ">":
                return Integer.parseInt(columnValue) > Integer.parseInt(value);
            case "<":
                return Integer.parseInt(columnValue) < Integer.parseInt(value);
            default:
                return false;
        }
    }
}
