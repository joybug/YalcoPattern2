package behavioral_patterns.strategy.ex02;

/**
 * 압축 전략 인터페이스입니다.
 * <p>
 * 다양한 압축 방식(Run-Length Encoding, 문자 치환 등)을 전략 패턴으로 구현할 때 사용합니다.
 * 각 압축 방식별로 compress() 메서드의 동작이 다르게 구현됩니다.
 */
public interface CompressionStrategy {
    /**
     * 문자열 데이터를 압축합니다.
     * @param data 압축할 원본 문자열
     * @return 압축된 문자열
     */
    String compress(String data);
}
