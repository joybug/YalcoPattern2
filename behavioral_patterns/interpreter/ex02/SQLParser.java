package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * SQLParser 클래스는 간단한 SQL SELECT 쿼리를 파싱하여 Expression 객체로 변환합니다.
 * WHERE 절이 있을 경우 WhereExpression을 생성하여 SelectExpression에 전달합니다.
 */
class SQLParser {
    /**
     * 쿼리 문자열을 파싱하여 Expression 객체로 변환합니다.
     * @param query SQL SELECT 쿼리 문자열
     * @return Expression 객체
     */
    public static Expression parse(String query) {
        // 공백 기준으로 쿼리 분리
        String[] parts = query.split("\\s+");
        if (!parts[0].equalsIgnoreCase("SELECT")) {
            throw new RuntimeException("Only SELECT statements are supported");
        }
        // SELECT 다음의 컬럼 목록 추출
        List<String> columns = Arrays.asList(parts[1].split(","));
        // FROM 다음의 테이블명 추출
        String tableName = parts[3];
        Expression whereClause = null;
        // WHERE 절이 있으면 WhereExpression 생성
        if (parts.length > 4 && parts[4].equalsIgnoreCase("WHERE")) {
            whereClause = new WhereExpression(tableName, parts[5], parts[6], parts[7]);
        }
        // SelectExpression 생성 및 반환
        return new SelectExpression(tableName, columns, whereClause);
    }
}
