package behavioral_patterns.strategy.ex02;

/**
 * 압축 컨텍스트 클래스
 */
public class Compressor {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public String compress(String data) {
        return strategy.compress(data);
    }
}
