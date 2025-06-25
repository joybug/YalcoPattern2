package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * Main 클래스는 SQL 인터프리터 패턴의 동작을 테스트하는 실행 예제입니다.
 */
public class Main {
    public static void main(String[] args) {
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
