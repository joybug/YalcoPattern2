package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * SelectExpression 클래스는 SELECT 구문 전체를 해석하는 표현식입니다.
 * 컬럼 선택, WHERE 조건 적용을 모두 처리합니다.
 */
class SelectExpression implements Expression {
    // 테이블 이름
    private String tableName;
    // 선택할 컬럼 리스트
    private List<String> columns;
    // WHERE 절 표현식
    private Expression whereClause;

    /**
     * SelectExpression 생성자
     * @param tableName 테이블 이름
     * @param columns 선택할 컬럼 리스트
     * @param whereClause WHERE 절 표현식(없으면 null)
     */
    public SelectExpression(String tableName, List<String> columns, Expression whereClause) {
        this.tableName = tableName;
        this.columns = columns;
        this.whereClause = whereClause;
    }

    /**
     * SELECT 쿼리를 해석하여 결과를 반환합니다.
     * @param context 데이터베이스 컨텍스트
     * @return 쿼리 결과(행 리스트)
     */
    @Override
    public List<Map<String, String>> interpret(Context context) {
        // 테이블 데이터 가져오기
        List<Map<String, String>> table = context.getTable(tableName);
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> row : table) {
            // 각 행을 별도의 Context로 감싸서 WHERE 절 평가
            Context rowContext = new Context();
            rowContext.setTable(tableName, Collections.singletonList(row));

            // WHERE 절이 없거나, 조건을 만족하면 결과에 추가
            if (whereClause == null || !whereClause.interpret(rowContext).isEmpty()) {
                Map<String, String> newRow = new HashMap<>();
                for (String column : columns) {
                    if (column.equals("*")) {
                        // *이면 모든 컬럼 추가
                        newRow.putAll(row);
                    } else {
                        // 지정된 컬럼만 추가
                        newRow.put(column, row.get(column));
                    }
                }
                result.add(newRow);
            }
        }
        return result;
    }
}
