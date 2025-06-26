package behavioral_patterns.strategy.ex02;

/**
 * 전략 패턴 압축 예제의 메인 클래스입니다.
 * <p>
 * Compressor 객체에 다양한 압축 전략을 주입하여,
 * 압축 방식에 따라 결과가 달라지는 것을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * Compressor 객체를 생성하고, RLE/문자치환 압축 전략을 각각 적용하여
     * 압축 결과를 출력합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // Compressor 객체 생성
        Compressor compressor = new Compressor();
        String data = "aabcccccaaa";

        // RLE 압축 전략 설정 및 결과 출력
        compressor.setCompressionStrategy(new RunLengthEncoding());
        System.out.println(
                "RLE Compression: " + compressor.compress(data)
        );
        // RLE Compression: a2b1c5a3

        // 문자 치환 압축 전략 설정 및 결과 출력
        compressor.setCompressionStrategy(new SimpleReplacementCompression());
        System.out.println(
                "Simple Replacement: " + compressor.compress(data)
        );
        // Simple Replacement: 11bccccc111
    }
}
