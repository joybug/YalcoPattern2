package behavioral_patterns.strategy.ex02;

/**
 * 런-렝스 인코딩(Run-Length Encoding, RLE) 압축 전략 클래스입니다.
 * <p>
 * CompressionStrategy 인터페이스를 구현하여,
 * 연속된 문자의 개수를 세어 압축하는 방식을 제공합니다.
 */
public class RunLengthEncoding implements CompressionStrategy {
    /**
     * 문자열을 RLE 방식으로 압축합니다.
     * 예: "aabcccccaaa" → "a2b1c5a3"
     * @param data 압축할 원본 문자열
     * @return 압축된 문자열
     */
    @Override
    public String compress(String data) {
        // 연속된 문자의 개수를 세어 압축
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= data.length(); i++) {
            if (i < data.length() && data.charAt(i) == data.charAt(i - 1)) {
                // 이전 문자와 같으면 개수 증가
                count++;
            } else {
                // 다르면 문자와 개수 추가
                compressed.append(data.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }
}
