package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * WhereExpression 클래스는 WHERE 절을 해석하는 표현식입니다.
 * 조건에 맞는 행만 결과로 반환합니다.
 */
class WhereExpression implements Expression {
    private String column;
    private String operator;
    private String value;
    private String tableName;

    public WhereExpression(String tableName, String column, String operator, String value) {
        this.tableName = tableName;
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public List<Map<String, String>> interpret(Context context) {
        List<Map<String, String>> result = new ArrayList<>();
        List<Map<String, String>> table = context.getTable(tableName);
        for (Map<String, String> row : table) {
            if (evaluate(row.get(column), operator, value)) {
                result.add(row);
            }
        }
        return result;
    }

    // 연산자에 따라 조건을 평가하는 메서드
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
