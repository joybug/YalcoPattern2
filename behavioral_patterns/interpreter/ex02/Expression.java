package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * Expression 인터페이스는 SQL 해석을 위한 추상 표현식을 정의합니다.
 * interpret 메서드는 context를 받아 결과를 반환합니다.
 */
interface Expression {
    /**
     * context를 받아 쿼리 결과를 반환하는 메서드
     * @param context 데이터베이스 컨텍스트
     * @return 쿼리 결과(행 리스트)
     */
    List<Map<String, String>> interpret(Context context);
}
