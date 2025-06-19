package builder.ex02;

import java.util.HashMap;
import java.util.Map;


/**
 * HTTP 요청을 구성하는 클래스
 * - 빌더 패턴을 사용하여 HTTP 요청을 유연하게 생성할 수 있도록 설계됨
 *
 * HTTP 요청 클래스 - 빌더 패턴 예시
 * 복잡한 HTTP 요청 객체를 유연하게 생성할 수 있게 해주는 클래스
 *
 * 주요 구성요소:
 * - method: HTTP 메서드 (GET, POST 등)
 * - url: 요청 URL
 * - headers: HTTP 헤더들
 * - parameters: URL 파라미터들
 * - body: HTTP 요청 본문
 *
 * 빌더 패턴의 장점:
 * 1. 필요한 데이터만 선택적으로 설정 가능
 * 2. 메서드 체이닝으로 가독성 향상
 * 3. 불변 객체 생성 가능
 */

public class HttpRequest {
    private String method;
    private String url;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;
    
    // private constructor
    private HttpRequest(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.headers = builder.headers;
        this.parameters = builder.parameters;
        this.body = builder.body;
    }
    
    @Override
    public String toString() {
        return "HttpRequest [method=" + method + ", url=" + url + 
               ", headers=" + headers + ", parameters=" + parameters + 
               ", body=" + body + "]";
    }

    /**
     * HTTP 요청을 구성하는 빌더 내부 클래스
     *
     * HTTP 요청 빌더 클래스
     * - HTTP 요청 객체를 단계별로 구성
     * - 각 설정 메서드는 빌더 자신을 반환하여 체이닝 가능
     * - build() 메서드로 최종 HTTP 요청 객체 생성
     */
    public static class Builder {
        private String method;
        private String url;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> parameters = new HashMap<>();
        private String body;

        /**
         * Builder 생성자
         * @param method HTTP 메소드 (GET, POST 등)
         * @param url 요청 URL
         */
        public Builder(String method, String url) {
            this.method = method;
            this.url = url;
        }

        /**
         * HTTP 헤더를 추가하는 메소드
         * @param key 헤더 키
         * @param value 헤더 값
         * @return Builder 인스턴스
         */
        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this; }

        /**
         * URL 파라미터를 추가하는 메소드
         * @param key 파라미터 키
         * @param value 파라미터 값
         * @return Builder 인스턴스
         */
        public Builder addParameter(String key, String value) {
            this.parameters.put(key, value);
            return this; }

        /**
         * HTTP 요청 바디를 설정하는 메소드
         * @param body 요청 바디 문자열
         * @return Builder 인스턴스
         */
        public Builder setBody(String body) {
            this.body = body;
            return this; }

        /**
         * 설정된 구성요소로 HTTP 요청 객체를 생성하는 메소드
         * @return 완성된 HttpRequest 객체
         */
        public HttpRequest build() {
            return new HttpRequest(this); }
    }
}
