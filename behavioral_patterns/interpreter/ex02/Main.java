package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * Main 클래스는 SQL 인터프리터 패턴의 동작을 테스트하는 실행 예제입니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * SQL 인터프리터 패턴을 사용한 쿼리 해석 기능을 시연합니다.
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 데이터베이스 컨텍스트 생성 (샘플 users 테이블 포함)
        Context context = new Context();

        // 쿼리 1: users 테이블의 모든 컬럼 조회
        String query1 = "SELECT * FROM users";
        Expression expr1 = SQLParser.parse(query1);
        List<Map<String, String>> result1 = expr1.interpret(context);
        System.out.println("Result of query: " + query1);
        for (Map<String, String> row : result1) {
            System.out.println(row);
        }

        // 쿼리 2: 나이가 27세 초과인 사용자의 name, age 조회
        String query2 = "SELECT name,age FROM users WHERE age > 27";
        Expression expr2 = SQLParser.parse(query2);
        List<Map<String, String>> result2 = expr2.interpret(context);
        System.out.println("\nResult of query: " + query2);
        for (Map<String, String> row : result2) {
            System.out.println(row);
        }
    }
}
