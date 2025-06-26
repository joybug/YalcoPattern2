package behavioral_patterns.strategy.ex02;

/**
 * 압축 컨텍스트 클래스입니다.
 * <p>
 * 압축 전략(CompressionStrategy)을 주입받아, 다양한 압축 방식을 사용할 수 있도록 합니다.
 */
public class Compressor {
    /**
     * 현재 사용 중인 압축 전략 객체
     */
    private CompressionStrategy strategy;

    /**
     * 압축 전략을 설정합니다.
     * @param strategy 사용할 압축 전략 객체
     */
    public void setCompressionStrategy(CompressionStrategy strategy) {
        // 압축 전략 변경
        this.strategy = strategy;
    }

    /**
     * 압축 동작을 수행합니다.
     * 현재 설정된 압축 전략의 compress() 메서드를 호출합니다.
     * @param data 압축할 원본 문자열
     * @return 압축된 문자열
     */
    public String compress(String data) {
        // 압축 전략에 따라 압축 동작 위임
        return strategy.compress(data);
    }
}
