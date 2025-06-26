package behavioral_patterns.strategy.ex02;

/**
 * 간단한 문자 치환 압축 전략 클래스입니다.
 * <p>
 * CompressionStrategy 인터페이스를 구현하여,
 * 모음(a, e, i, o, u)을 숫자로 치환하는 방식으로 압축합니다.
 */
public class SimpleReplacementCompression implements CompressionStrategy {
    /**
     * 문자열 내의 모음(a, e, i, o, u)을 각각 1~5로 치환하여 압축합니다.
     * @param data 압축할 원본 문자열
     * @return 치환된 문자열
     */
    @Override
    public String compress(String data) {
        // 각 모음을 숫자로 치환
        return data.replace("a", "1")
                   .replace("e", "2")
                   .replace("i", "3")
                   .replace("o", "4")
                   .replace("u", "5");
    }
}
