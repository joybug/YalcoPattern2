package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * SQLParser 클래스는 간단한 SQL SELECT 쿼리를 파싱하여 Expression 객체로 변환합니다.
 * WHERE 절이 있을 경우 WhereExpression을 생성하여 SelectExpression에 전달합니다.
 */
class SQLParser {
    public static Expression parse(String query) {
        String[] parts = query.split("\\s+");
        if (!parts[0].equalsIgnoreCase("SELECT")) {
            throw new RuntimeException("Only SELECT statements are supported");
        }
        List<String> columns = Arrays.asList(parts[1].split(","));
        String tableName = parts[3];
        Expression whereClause = null;
        if (parts.length > 4 && parts[4].equalsIgnoreCase("WHERE")) {
            whereClause = new WhereExpression(tableName, parts[5], parts[6], parts[7]);
        }
        return new SelectExpression(tableName, columns, whereClause);
    }
}
