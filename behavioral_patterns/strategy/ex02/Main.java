package behavioral_patterns.strategy.ex02;

/**
 * 전략 패턴 압축 예제의 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();
        String data = "aabcccccaaa";

        compressor.setCompressionStrategy(new RunLengthEncoding());
        System.out.println(
                "RLE Compression: " + compressor.compress(data)
        );
        // RLE Compression: a2b1c5a3

        compressor.setCompressionStrategy(new SimpleReplacementCompression());
        System.out.println(
                "Simple Replacement: " + compressor.compress(data)
        );
        // Simple Replacement: 11bccccc111
    }
}
