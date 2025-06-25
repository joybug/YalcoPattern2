package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * Context 클래스는 데이터베이스 테이블 역할을 하며,
 * 테이블 이름과 데이터(행 리스트)를 관리합니다.
 * 샘플 데이터(users 테이블)를 생성자에서 초기화합니다.
 */
public class Context {
    private Map<String, List<Map<String, String>>> tables;

    public Context() {
        this.tables = new HashMap<>();
        // 샘플 데이터(users 테이블) 초기화
        List<Map<String, String>> users = new ArrayList<>();
        users.add(new HashMap<String, String>() {{
            put("id", "1");
            put("name", "John");
            put("age", "30");
        }});
        users.add(new HashMap<String, String>() {{
            put("id", "2");
            put("name", "Jane");
            put("age", "25");
        }});
        tables.put("users", users);
    }

    public List<Map<String, String>> getTable(String name) {
        return tables.get(name);
    }

    public void setTable(String name, List<Map<String, String>> table) {
        tables.put(name, table);
    }
}
