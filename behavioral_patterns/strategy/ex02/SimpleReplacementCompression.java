package behavioral_patterns.strategy.ex02;

/**
 * 간단한 문자 치환 압축 전략 클래스
 */
public class SimpleReplacementCompression implements CompressionStrategy {
    @Override
    public String compress(String data) {
        return data.replace("a", "1")
                   .replace("e", "2")
                   .replace("i", "3")
                   .replace("o", "4")
                   .replace("u", "5");
    }
}
