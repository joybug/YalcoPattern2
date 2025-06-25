package behavioral_patterns.interpreter.ex02;

import java.util.*;

/**
 * Expression 인터페이스는 SQL 해석을 위한 추상 표현식을 정의합니다.
 * interpret 메서드는 context를 받아 결과를 반환합니다.
 */
interface Expression {
    List<Map<String, String>> interpret(Context context);
}
